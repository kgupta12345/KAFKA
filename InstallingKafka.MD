STEP#0: Get Java
STEP#1: Download kafka_2.12-2.3.0.tgz
STEP#2: tar -xzf kafka_2.12-2.3.0.tgz
STEP#3: cd kafka_2.12-2.3.0
STEP#4: 
**Start the zookeeper server ( it manages brokers on distributed system)**
**rahul@rahul-VirtualBox:/usr/local/kafka/kafka_2.12-2.3.0$** bin/zookeeper-server-start.sh config/zookeeper.properties

**Zookeeper starts at port 2181**
![image](https://user-images.githubusercontent.com/45539698/65813293-02b07f00-e1f1-11e9-8921-09815b43ab47.png)


**Now start the Kafka server/broker service. It starts @ 9092:**
**rahul@rahul-VirtualBox:/usr/local/kafka/kafka_2.12-2.3.0$** bin/kafka-server-start.sh config/server.properties

![Capture1](https://user-images.githubusercontent.com/45539698/65813431-bc5c1f80-e1f2-11e9-8336-085dfe065312.JPG)




**Now Let's create a Topic:**

bin/kafka-topics.sh --zookeeper localhost:2181 --create --topic demotopic --replication-factor 1 --partitions 2 
As we have 1 server/broker running, therefore both the partitions are created on te single server/broker.

**Producer-Consumer Interacting with Server/Broker

**Now Let's create a Producer Application:**
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic demotopic

**Now Let's create a Consumer Applictaion:**
 bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic demotopic --from-beginning
 
 ![image](https://user-images.githubusercontent.com/45539698/65813234-18717480-e1f0-11e9-8440-ce24d5a239bb.png)

 **WHAT IF**
 bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic someothertopic --from-beginning
![image](https://user-images.githubusercontent.com/45539698/65813241-363ed980-e1f0-11e9-8806-a4fd584ab632.png)
