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
