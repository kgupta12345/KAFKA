cp spark-defaults.conf.template spark-defaults.conf.sh



YARN: http://localhost:8088/cluster
HADOOPUI: http://localhost:9870/dfshealth.html#tab-overview
SPARKUI: http://localhost:4040/jobs/
SPARK MASTER UI: http://localhost:8080/ 

======================================================================

START: HADOOP

START: SPARK CLUSTER FOR S/A MODE
cd /usr/local/spark/spark-2.3.4-bin-hadoop2.7/sbin/
./start-all.sh

--------------
LOCAL MODE:


START: spark-shell
 
YARN (http://localhost:8088/cluster)- Launches |Because Hadoop is Running | No Activity
SPARKUI(http://localhost:4040/jobs/) - Laucnches | No Activity logged
SPARK MASTER UI (http://localhost:8080/) -  No Activity
 
 
NEW TERMINAL: 
 
FIRE: spark-submit   --class org.apache.spark.examples.SparkPi   --master local[8]   /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar   1000
 
YARN (http://localhost:8088/cluster)-  No Activity
SPARKUI(http://localhost:4040/jobs/) - No Activity | http://localhost:4041/jobs/ --->  Activity logging(ing) |After the execution is completed the URL http://localhost:4041/jobs/ is not more active.
SPARK MASTER UI (http://localhost:8080/) -  No Activity
 
SPARK-SHELL TERMINAL:
 
scala> spark.read.format("csv").option("header","true").load("file:///home/rahul/JustFolder/air*")
scala> res1.show
 
  
YARN (http://localhost:8088/cluster)-  No Activity
SPARKUI(http://localhost:4040/jobs/) - Activity (spark reaad and show) logged
SPARK MASTER UI (http://localhost:8080/) -  No Activity
 
 ======================================================================
 STANDALONE MODE:[FRESH SETUP]



START:  spark-shell --master spark://localhost:7077
 
YARN (http://localhost:8088/cluster)-  No Activity
SPARKUI(http://localhost:4040/jobs/) -   Launches | No activity logged
SPARK MASTER UI (http://localhost:8080/) -  Application Id generated on UI
 
NEW TERMINAL:
 
FIRE:  
spark-submit   --class org.apache.spark.examples.SparkPi   --master spark://localhost:7077   --executor-memory 20G   --total-executor-cores 100   /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar 100

 
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
