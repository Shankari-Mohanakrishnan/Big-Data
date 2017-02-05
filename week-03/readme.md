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
