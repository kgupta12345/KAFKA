STEP#0: Get Java
STEP#1: Download kafka_2.12-2.3.0.tgz
STEP#2: tar -xzf kafka_2.12-2.3.0.tgz
STEP#3: cd kafka_2.12-2.3.0
STEP#4: Start the zookeeper server (here, it manages brokers on distributed system)
**rahul@rahul-VirtualBox:/usr/local/kafka/kafka_2.12-2.3.0$** bin/zookeeper-server-start.sh config/zookeeper.properties

Now start the Kafka server/broker:
**rahul@rahul-VirtualBox:/usr/local/kafka/kafka_2.12-2.3.0$** bin/kafka-server-start.sh config/server.properties



bin/kafka-topics.sh --zookeeper localhost:2181 --create --topic demotopic --replication-factor 1 --partitions 2 
As we have 1 server/broker running, therefore both the partitions are created on te single server/broker.

Now Let's create a Producer:
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic demotopic


Now Let's create a Consumer:
 bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic demotopic --from-beginning
 
 
 
 bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic someothertopic --from-beginning
