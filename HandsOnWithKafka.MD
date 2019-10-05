## Practical with Kafka

##### STEP#0: Get Java8:

```
[1] Download jdk-8u221-linux-x64.tar.gz from the Official Website.
[2] Extract jdk-8u221-linux-x64.tar.gz:
    tar -xzvf jdk-8u221-linux-x64.tar.gz
[3] Move Extracted folder (jdk1.8.0_221) to a desired location. In my case I created /usr/local/java [with permissions]:
    mv jdk1.8.0_221 /usr/local/java
[4] Open ~/.bashrc file to set the Environmental Varibles:
    sudo gedit ~/.bashrc	
[5] In the file, mention the below two lines (in the end):
    export JAVA_HOME=/usr/local/java/jdk1.8.0_221
    export PATH=$PATH:/usr/local/java/jdk1.8.0_221/bin
[6] Save the file.
[7] Publish the changes:
    source ~/.bashrc
[8] Check the Java Version: 
    java -version
```
##### STEP#1: Download & Install kafka:
```
[1] Download kafka_2.12-2.3.0.tgz
[2] Extract kafka_2.12-2.3.0.tgz:
    kafka_2.12-2.3.0
[3] Move Extracted folder (kafka_2.12-2.3.0) to a desired location. In my case I created /usr/local/kafka [with permissions]:
    mv kafka_2.12-2.3.0 /usr/local/kafka   
    
```
##### STEP#2: Start Zookeeper
```
cd /usr/local/kafka/kafka_2.12-2.3.0
bin/zookeeper-server-start.sh config/zookeeper.properties 

```
**Zookeeper starts at port 2181**
![image](https://user-images.githubusercontent.com/45539698/66250650-2892d200-e763-11e9-9a29-2255515a6c16.png)


##### STEP#3: Create & Start Multiple Brokers:
```
cd /usr/local/kafka/kafka_2.12-2.3.0/config


```

##### STEP#4: Create Topic
```
cd /usr/local/kafka/kafka_2.12-2.3.0

```

##### STEP#5: Create Producer
```
```
##### STEP#6: Create Consumer
```
```

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
