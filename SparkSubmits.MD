YARN: http://localhost:8088/cluster
HADOOPUI: http://localhost:9870/dfshealth.html#tab-overview
SPARKUI: http://localhost:4040/jobs/
 
 ======================================================================

CHANGES IN CONF[spark-defaults.conf.sh]:
PATH: /usr/local/spark/spark-2.3.4-bin-hadoop2.7/conf/spark-defaults.conf.sh

spark.master                     spark://localhost:7077

-----------------------------------------------------------------------

CHANGES IN CONF[spark-env.sh]:
PATH: /usr/local/spark/spark-2.3.4-bin-hadoop2.7/conf/spark-env.sh

JAVA_HOME=/usr/local/java/jdk1.8.0_211
SPARK_MASTER_HOST=localhost
SPARK_MASTER_PORT=7077
YARN_CONF_DIR=/usr/local/hadoop/hadoop-3.2.0/etc/hadoop
HADOOP_CONF_DIR=/usr/local/hadoop/hadoop-3.2.0/etc/hadoop

=======================================================================
 
 LOCAL MODE:
 
/usr/local/spark/spark-2.3.4-bin-hadoop2.7/
 
 spark-submit   --class org.apache.spark.examples.SparkPi   --master local[8]   /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar   1000

/usr/local/spark/spark-2.3.4-bin-hadoop2.7/

/usr/local/spark/spark-2.3.4-bin-hadoop2.7/conf


spark-submit \
  --class org.apache.spark.examples.SparkPi \
  --master spark://localhost:7077 \
  --executor-memory 20G \
  --total-executor-cores 100 \
  /usr/local/spark/spark-2.3.4-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.3.4.jar \
  1000

make changes in the spark-env master and port


spark-shell --master yarn


spark-shell --master spark://localhost:7077
