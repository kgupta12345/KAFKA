### Practical with Spark Hits
###### This guide aims to compare various spark activities: Launch of spark-shell, Action from spark-shell, spark-submit on Local, StandAlone and Yarn Mode.
![image](https://user-images.githubusercontent.com/45539698/69361353-53ed6400-0cb2-11ea-961b-33bad51efa8a.png)

``` 
```

| LOCAL MODE |
|---|

``` 
```
##### ```ACTION:``` Launch spark-shell
![image](https://user-images.githubusercontent.com/45539698/69361542-b6defb00-0cb2-11ea-9340-df936cc4f6ee.png)
##### ```OBSERVATION:```  
 - ###### YARN [http://localhost:8088/cluster]- Launches | Because Hadoop is Running | No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69361707-01607780-0cb3-11ea-855f-2e404a10a246.png)
 - ###### SPARKUI[http://localhost:4040/jobs/] - Launches | No Activity logged
   ![image](https://user-images.githubusercontent.com/45539698/69361734-15a47480-0cb3-11ea-9254-b6937a25c505.png)
 - ###### SPARK MASTER UI [http://localhost:8080/] -  No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69361766-248b2700-0cb3-11ea-85b1-e827b9c51179.png)
<hr>
 
##### ```ACTION:``` Action from spark-shell
![image](https://user-images.githubusercontent.com/45539698/69362736-1ccc8200-0cb5-11ea-8144-d9d687824b7a.png)
*spark.read.format("csv").option("header","true").load("file:///home/rahul/JustFolder/air*")*
##### ```OBSERVATION:```  
 - ###### YARN [http://localhost:8088/cluster]- Launches | Because Hadoop is Running | No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69361707-01607780-0cb3-11ea-855f-2e404a10a246.png)
 - ###### SPARKUI[http://localhost:4040/jobs/] - Activity logged
   ![image](https://user-images.githubusercontent.com/45539698/69362975-93697f80-0cb5-11ea-808b-eeb8c535958a.png)
 - ###### SPARK MASTER UI [http://localhost:8080/] -  No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69361766-248b2700-0cb3-11ea-85b1-e827b9c51179.png)

<hr>

##### ```ACTION:``` Making a spark-submit
![image](https://user-images.githubusercontent.com/45539698/69363900-54d4c480-0cb7-11ea-8a35-2f0caee93ce3.png)
*spark-submit --class org.apache.spark.examples.SparkPi --master local[8]  /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 1000*
##### ```OBSERVATION:```
 - ###### YARN [http://localhost:8088/cluster]- Launches | Because Hadoop is Running | No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69361707-01607780-0cb3-11ea-855f-2e404a10a246.png)
 - ###### SPARKUI[http://localhost:4040/jobs/] -  No Activity | Activity logging on http://localhost:4041/jobs/  |After the execution is completed the URL http://localhost:4041/jobs/ is not more active.
   ![image](https://user-images.githubusercontent.com/45539698/69363589-c4967f80-0cb6-11ea-97d5-b1611d409364.png) 
 - ###### SPARK MASTER UI [http://localhost:8080/] -  No Activity logged | Because weare on Local Mode
   ![image](https://user-images.githubusercontent.com/45539698/69361766-248b2700-0cb3-11ea-85b1-e827b9c51179.png)
 
``` 
```

| STANDALONE MODE |
|---|

``` 
```

##### ```ACTION:``` Launch spark-shell --master spark://localhost:7077
![image](https://user-images.githubusercontent.com/45539698/69374132-6e800700-0ccb-11ea-93a7-666a6bf7915f.png)
##### ```OBSERVATION:``` 
 - ###### YARN [http://localhost:8088/cluster]- Launches | Because Hadoop is Running | No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69361707-01607780-0cb3-11ea-855f-2e404a10a246.png)
 - ###### SPARKUI[http://localhost:4040/jobs/] - Launches | No Activity logged
   ![image](https://user-images.githubusercontent.com/45539698/69374180-8c4d6c00-0ccb-11ea-94ad-2a5b63d72e82.png)
 - ###### SPARK MASTER UI [http://localhost:8080/] - Activity logged
   ![image](https://user-images.githubusercontent.com/45539698/69374290-c0289180-0ccb-11ea-9f81-cb82b233212b.png)

<hr>
 
##### ```ACTION:``` Action from spark-shell
![image](https://user-images.githubusercontent.com/45539698/69374515-34633500-0ccc-11ea-95fe-434ae041fc5a.png)
*spark.read.format("csv").option("header","true").load("file:///home/rahul/JustFolder/air*")*
##### ```OBSERVATION:```  
 - ###### YARN [http://localhost:8088/cluster]- Launches | Because Hadoop is Running | No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69361707-01607780-0cb3-11ea-855f-2e404a10a246.png)
 - ###### SPARKUI[http://localhost:4040/jobs/] - Activity logged
   ![image](https://user-images.githubusercontent.com/45539698/69374582-5a88d500-0ccc-11ea-8aab-57a32d72322d.png)
 - ###### SPARK MASTER UI [http://localhost:8080/] -  No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69374290-c0289180-0ccb-11ea-9f81-cb82b233212b.png)

<hr>

##### ACTION: Making a spark-submit
![image](https://user-images.githubusercontent.com/45539698/69372580-f95f0280-0cc7-11ea-9fe4-c6a1317b6065.png)
*spark-submit --class org.apache.spark.examples.SparkPi --master spark://localhost:7077 /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar*
##### OBSERVATION: 
 - ###### YARN [http://localhost:8088/cluster]- Launches | Because Hadoop is Running | No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69361707-01607780-0cb3-11ea-855f-2e404a10a246.png)
 - ###### SPARKUI[http://localhost:4040/jobs/] -  No Activity
   ![image](https://user-images.githubusercontent.com/45539698/69410243-a4a3a200-0d30-11ea-95e9-5cf5ae1a36ef.png)
 - ###### SPARK MASTER UI [http://localhost:8080/] -  Activity logged
   ![image](https://user-images.githubusercontent.com/45539698/69410447-18de4580-0d31-11ea-8404-20940f470d2b.png)

###### ```P.S. The spark-subit did not worked in first go. May be due to resources. So had to restart master & slaves```
<hr> 
``` 
```
| YARN MODE |
|---|
```
```
<hr>

##### ```ACTION:``` Launch spark-shell --master yarn
![image](https://user-images.githubusercontent.com/45539698/69411497-167ceb00-0d33-11ea-9b93-93e2935f4598.png)
##### ```OBSERVATION:``` 
 - ###### YARN [http://localhost:8088/cluster]- Activity logged
   ![image](https://user-images.githubusercontent.com/45539698/69411543-32808c80-0d33-11ea-9219-d1010959ba04.png)
 - ###### SPARKUI[http://localhost:4040/jobs/] -
   ![image](https://user-images.githubusercontent.com/45539698/69411864-d1a58400-0d33-11ea-987c-ffeabbdcaadb.png)
   ![image](https://user-images.githubusercontent.com/45539698/69411619-5348e200-0d33-11ea-97ec-1c5eab4a6bfa.png)
 - ###### SPARK MASTER UI [http://localhost:8080/] - 
   ![image](https://user-images.githubusercontent.com/45539698/69411740-87bc9e00-0d33-11ea-8849-6043a18d3d38.png)
<hr>

##### ```ACTION:``` Action from spark-shell

*spark.read.format("csv").option("header","true").load("file:///home/rahul/JustFolder/air*")*
##### ```OBSERVATION:```  
 - ###### YARN [http://localhost:8088/cluster]-
 
 - ###### SPARKUI[http://localhost:4040/jobs/] -
 
 - ###### SPARK MASTER UI [http://localhost:8080/] -  
 

<hr>

##### ACTION: Making a spark-submit

*spark-submit --class org.apache.spark.examples.SparkPi --master yarn /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar*
##### OBSERVATION: 
 - ###### YARN [http://localhost:8088/cluster]- 
 - ###### SPARKUI[http://localhost:4040/jobs/] - 
 - ###### SPARK MASTER UI [http://localhost:8080/] - 

















``` 
======================================================================
 
YARN: http://localhost:8088/cluster
HADOOPUI: http://localhost:9870/dfshealth.html#tab-overview
SPARKUI: http://localhost:4040/jobs/
SPARK MASTER UI: http://localhost:8080/ 

==========================

START: HADOOP

START: SPARK CLUSTER FOR S/A MODE
cd /usr/local/spark/spark-2.3.4-bin-hadoop2.7/sbin/
./start-all.sh

--------------
 
======================================================================
 STANDALONE MODE:[FRESH SETUP]



START:  spark-shell --master spark://localhost:7077
 
YARN (http://localhost:8088/cluster)-  No Activity
SPARKUI(http://localhost:4040/jobs/) -   Launches | No activity logged
SPARK MASTER UI (http://localhost:8080/) -  Application Id generated on UI
 
NEW TERMINAL:
 
FIRE:  
spark-submit   --class org.apache.spark.examples.SparkPi   --master spark://localhost:7077   --executor-memory 1G   --total-executor-cores 2   /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 100

 
YARN (http://localhost:8088/cluster)-  No Activity
SPARKUI(http://localhost:4040/jobs/) -  No Activity | http://localhost:4041/jobs/ --->  Activity happen(ing)
SPARK MASTER UI (http://localhost:8080/) -  Application Id generated on UI
 
  
SPARK-SHELL TERMINAL:

scala> spark.read.format("csv").option("header","true").load("file:///home/rahul/JustFolder/air*")
scala> res1.show
 
 
YARN (http://localhost:8088/cluster)-  No Activity
SPARKUI(http://localhost:4040/jobs/) -  Activity (spark reaad and show) logged
SPARK MASTER UI (http://localhost:8080/) - No Activity   

 
 ======================================================================
 YARN MODE:
 
START:  spark-shell --master yarn
 
 
YARN (http://localhost:8088/cluster)-  Activity logged on YARN UI
SPARKUI(http://localhost:4040/jobs/) -  Launches | No activity logged 
SPARK MASTER UI (http://localhost:8080/) -  No Activity   
 
NEW TERMIANL
 
FIRE:  
spark-submit   --class org.apache.spark.examples.SparkPi   --master yarn   --executor-memory 20G   --total-executor-cores 100   /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 100


spark-submit   --class org.apache.spark.examples.SparkPi   --master yarn  /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 100
 
YARN (http://localhost:8088/cluster)-  XXXXXXXXXXXXXXX
SPARKUI(http://localhost:4040/jobs/) -  XXXXXXXXXXXXXXX
SPARK MASTER UI (http://localhost:8080/) -  XXXXXXXXXXXXXXX
  
SPARK-SHELL TERMINAL:

scala> spark.read.format("csv").option("header","true").load("file:///home/rahul/JustFolder/air*")
scala> res1.show
 
 
YARN (http://localhost:8088/cluster)-  No Activity
SPARKUI(http://localhost:4040/jobs/) -  Activity (spark reaad and show) logged
SPARK MASTER UI (http://localhost:8080/) - No Activity    
 
 
=============================================================================================================================
cd /home/rahul/IdeaProjects/SparkScalaMavenApp/target


spark-submit --class com.sparkscala.WordCount SparkScalaMavenApp-1.0-SNAPSHOT.jar /home/rahul/IdeaProjects/SparkScalaMavenApp/src/main/resource/samplesource.txt
```
