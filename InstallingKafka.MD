STEP#1: Download kafka_2.12-2.3.0.tgz
STEP#2: tar -xzf kafka_2.12-2.3.0.tgz
STEP#3: cd kafka_2.12-2.3.0
STEP#4: Start the zookeeper server (here, it manages brokers on distributed system)
**rahul@rahul-VirtualBox:/usr/local/kafka/kafka_2.12-2.3.0$** bin/zookeeper-server-start.sh config/zookeeper.properties

Now start the Kafka server:
**rahul@rahul-VirtualBox:/usr/local/kafka/kafka_2.12-2.3.0$** bin/kafka-server-start.sh config/server.properties
