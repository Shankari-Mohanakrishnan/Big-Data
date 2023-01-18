1. Start the vagrant
	vagrant up
2. Start the secure shell
	vagrant ssh
3. Move all the files that are downloaded from blackboard to be read to the data folder.
4.Format the hdfs 
	hdfs namenode-format
5. Start HDFS 
	start-dfs.sh
6. Start MapReduce. 
	mr-jobbhistory-deamon.sh start historyserver
7. Download all the text files from blackboard and place it in data folder under Ubuntu_trusty_64. 
8. Now move all this file to hadoop.
	i) Create a directory. 
		hadoop fs -mkdir -p /USER/$USER/inputs
	ii)Copy files from local to hadoop. 
		hadoop fs -copyFromLocal ./* /user/$USER/inputs
	iii)To check if the files have been copied.
		hadoop fs -ls /user/$USER
9. create a directory week5.
	mkdir week5
10. Move into the directory week5
	cd week5

Executing WordCount.java

1. create a new java file WordCount.java
	vim WordCount.java
2. Copy the WordCount.java code from http://hadoop.apache.org/docs/current/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html
3. Compile the code.
	hadoop com.sun.tools.javac.Main WordCount.java
4. create JAR.
	jar cf wc.jar WordCount.class
5. Run the program.
	hadoop jar wc.jar WordCount /user/$USER/inputs /user/	$USER/output
6. To view the output.
	hadoop fs -cat /user/$USER/output/part-r-00000

Executing WordCount2.java

1. create a new java file WordCount.java
	vim WordCount2.java
2. Copy the WordCount2.java code from http://hadoop.apache.org/docs/current/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html
3. Compile the code.
	hadoop com.sun.tools.javac.Main WordCount2.java
4. create JAR.
	jar cf wc2.jar WordCount2.class
5. Run the program.
	hadoop jar wc2.jar WordCount2 /user/$USER/inputs /user/	$USER/output-2
6. To view the output.
	hadoop fs -cat /user/$USER/output-2/part-r-00000

Executing WordCount3.java

1. create a new java file WordCount.java
	vim WordCount3.java
2. Copy the WordCount1.java code from http://hadoop.apache.org/docs/current/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html
3. Modify the code such that the word occurs only if there are 
   4 or more occurences. 
4. Compile the code.
	hadoop com.sun.tools.javac.Main WordCount3.java
4. create JAR.
	jar cf wc3.jar WordCount3.class
5. Run the program.
	hadoop jar wc3.jar WordCount3 /user/$USER/inputs /user/	$USER/output-3
6. To view the output.
	hadoop fs -cat /user/$USER/output-3/part-r-00000

Executing WordCount4.java






