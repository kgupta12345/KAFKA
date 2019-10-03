YARN: http://localhost:8088/cluster
HADOOPUI: http://localhost:9870/dfshealth.html#tab-overview
SPARKUI: http://localhost:4040/jobs/
SPARK MASTER UI: http://localhost:8080/ 
======================================================================

START: HADOOP
--------------
LOCAL MODE:


START: spark-shell
 
YARN (http://localhost:8088/cluster)- Launches |Because Hadoop is Running | No Activity
SPARKUI(http://localhost:4040/jobs/) - Laucnches | Becasue spark-shell is running | No Activity
SPARK MASTER UI (http://localhost:8080/) - Does Not Launches | spark-shell has been stared with local mode not master mode | No Activity
 
 
NEW TERMINAL: cd /usr/local/spark/spark-2.3.4-bin-hadoop2.7/
 
FIRE: spark-submit   --class org.apache.spark.examples.SparkPi   --master local[8]   /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar   100
 
YARN (http://localhost:8088/cluster)-  No Activity
SPARKUI(http://localhost:4040/jobs/) - No Activity | http://localhost:4041/jobs/ | Activity happening
SPARK MASTER UI (http://localhost:8080/) -  No Activity
 
SPARK-SHELL TERMINAL:
 
scala> spark.read.format("csv").option("header","true").load("file:///home/rahul/JustFolder/air*")
scala> res1.show
 
  
YARN (http://localhost:8088/cluster)-  No Activity
SPARKUI(http://localhost:4040/jobs/) -  Activity happening
SPARK MASTER UI (http://localhost:8080/) -  No Activity
 
 ======================================================================
 STANDALONE MODE:
 
 startall.sh then
START:  spark-shell --master spark://localhost:7077
 
YARN (http://localhost:8088/cluster)-  
SPARKUI(http://localhost:4040/jobs/) -  
SPARK MASTER UI (http://localhost:8080/) -  
 
NEW TERMIANL, cd /usr/local/spark/spark-2.3.4-bin-hadoop2.7/
 
FIRE:  
spark-submit   --class org.apache.spark.examples.SparkPi   --master spark://localhost:7077   --executor-memory 20G   --total-executor-cores 100   /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 100

 
YARN (http://localhost:8088/cluster)-  
SPARKUI(http://localhost:4040/jobs/) -  
SPARK MASTER UI (http://localhost:8080/) -  
  
SPARK-SHELL TERMINAL:

scala> spark.read.format("csv").option("header","true").load("file:///home/rahul/JustFolder/air*")
scala> res1.show
 
 
YARN (http://localhost:8088/cluster)-  
SPARKUI(http://localhost:4040/jobs/) -  
SPARK MASTER UI (http://localhost:8080/) -    

 
 ======================================================================
 YARN MODE:
 
START:  spark-shell --master yarn
 
 
YARN (http://localhost:8088/cluster)-  
SPARKUI(http://localhost:4040/jobs/) -  
SPARK MASTER UI (http://localhost:8080/) -  
 
NEW TERMIANL, cd /usr/local/spark/spark-2.3.4-bin-hadoop2.7/
 
FIRE:  
spark-submit   --class org.apache.spark.examples.SparkPi   --master spark://localhost:7077   --executor-memory 20G   --total-executor-cores 100   /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 100

 
YARN (http://localhost:8088/cluster)-  
SPARKUI(http://localhost:4040/jobs/) -  
SPARK MASTER UI (http://localhost:8080/) -  
  
SPARK-SHELL TERMINAL:

scala> spark.read.format("csv").option("header","true").load("file:///home/rahul/JustFolder/air*")
scala> res1.show
 
 
YARN (http://localhost:8088/cluster)-  
SPARKUI(http://localhost:4040/jobs/) -  
SPARK MASTER UI (http://localhost:8080/) -  
 
 
=============================================================================================================================
TO EXPERIMENT:


spark-submit   --class org.apache.spark.examples.SparkPi   --master yarn   --executor-memory 20G   --total-executor-cores 100   /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 1000
 
 =============================================================================================================================
 
 
 
