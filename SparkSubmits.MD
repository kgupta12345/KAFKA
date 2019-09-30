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


CHANGES IN CONF:
/usr/local/spark/spark-2.3.4-bin-hadoop2.7/conf/spark-defaults.conf.sh
spark.master                     spark://localhost:7077




CHANGES IN SBIN:
/usr/local/spark/spark-2.3.4-bin-hadoop2.7/conf/spark-env.sh

JAVA_HOME=/usr/local/java/jdk1.8.0_211
SPARK_MASTER_HOST=localhost
SPARK_MASTER_PORT=7077


YARN_CONF_DIR=/usr/local/hadoop/hadoop-3.2.0/etc/hadoop

HADOOP_CONF_DIR=/usr/local/hadoop/hadoop-3.2.0/etc/hadoop

spark-shell --master yarn


spark-shell --master spark://localhost:7077
