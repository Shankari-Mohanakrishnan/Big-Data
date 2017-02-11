Check for prerequistes: 
1)Install java by using the command sudo apt-get install default-jdk
2)Check if java has installed using the following commands:
java
javac
3)To find the version of java installed use the command
java-version

Installing hadoop:
1) Go to hadoop.apache.org -> choose release 2.5.2 
2) Get the link and use the command
wget://apache.claz.org/hadoop/common/hadoop-2.5.2/hadoop-2.5.2.tar.gz 
3) To unzip:
	tar -xzvf hadoop-2.5.2.tar.gz

To set path:
1) Go to the ~/.bashrc file. This is done by:
   vim ~/.bashrc
2) Add this piece of code to the end of the file opened.

	export JAVA_HOME=/usr
	export HADOOP_HOME=~/hadoop-2.5.2
	export HADOOP_CLASSPATH=/usr/lib/jvm/java-7-openjdk-	amd64/lib/tools.jar
	export PATH=$PATH:$HADOOP_HOME/bin:$HADOOP_HOME/sbin
3) To check if hadoop has installed use the command
    hadoop version

To setup a pseudodistributed mode:

Changes must be made in the following configuration files:
	1) core-site.xml
	2) hdfs-site.xnl
	3) mapred-site.xml
	4) yarn-site.xml

The changes that must be made in core-site.xml.

<configuration>
<property>
<name>fs.defaultFS</name>
<value>hdfs://localhost/</value>
</property>
</configuration>

The changes that must be made in hdfs-site.xml.

<configuration>
<property>
<name>dfs.replication</name>
<value>1</value>
</property>
</configuration>

The changes that must be made in mapred-site.xml.

<configuration>
<property>
<name>mapreduce.framework.name</name>
<value>yarn</value>
</property>
</configuration>

The changes that must be made in yarn-site.xml.

<configuration>
<property>
<name>yarn.resourcemanager.hostname</name>
<value>localhost</value>
</property>
<property>
<name>yarn.nodemanager.aux-services</name>
<value>mapreduce_shuffle</value>
</property>
</configuration>

To cofigure ssh.

1) Saving key pair use the command:
   ssh-keygen
2) Setting passwordless login.
    ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa
    cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys
3) To test connection.
   ssh-copy-id vagrant@localhost

To see visualization.

1) Add these three lines to the vagrant file
    config.vm.network "forwarded_port", guest: 50070, host: 50070
    config.vm.network "forwarded_port", guest: 8088, host: 8088
    config.vm.network "forwarded_port", guest: 19888, host: 19888
2) To effect these changes.
    vagrant reload --provision


Formatting the HDFS -> hdfs namenode -format
Starting HDFS  ->   start-dfs.sh
Starting YARN  ->   start-yarn.sh
Starting MapReduce->mr-jobbhistory-deamon.sh start historyserver
