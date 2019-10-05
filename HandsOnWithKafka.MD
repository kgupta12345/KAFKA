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
[1] Download: kafka_2.12-2.3.0.tgz
[2] Extract: kafka_2.12-2.3.0.tgz:
    kafka_2.12-2.3.0
[3] Move Extracted folder (kafka_2.12-2.3.0) to a desired location. In my case I created /usr/local/kafka [with permissions]:
    mv kafka_2.12-2.3.0 /usr/local/kafka   
    
```
##### STEP#2: Start Zookeeper
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/zookeeper-server-start.sh config/zookeeper.properties 
[3] Zookeeper started on port 2181   
```
*Zookeeper started on port 2181*
![image](https://user-images.githubusercontent.com/45539698/66250650-2892d200-e763-11e9-9a29-2255515a6c16.png)


##### STEP#3: Create & Start Multiple Brokers:
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/config
[2] Now, create multiple Brokers:
    cp server.propertiess server-1.properties
    cp server.propertiess server-2.properties
    cp server.propertiess server-3.properties
[3] Now edit the below properties in the above broker files:
    - sudo gedit server.properties
    - broker.id=0
    - listeners=PLAINTEXT://:9090
    - log.dirs=/tmp/kafka-logs-0
    --------------------------------
    - sudo gedit server-1.properties
    - broker.id=1
    - listeners=PLAINTEXT://:9091
    - log.dirs=/tmp/kafka-logs-1
    --------------------------------
    - sudo gedit server-2.properties
    - broker.id=2
    - listeners=PLAINTEXT://:9092
    - log.dirs=/tmp/kafka-logs-2
    --------------------------------
    - sudo gedit server-3.properties
    - broker.id=3
    - listeners=PLAINTEXT://:9093
    - log.dirs=/tmp/kafka-logs-3
    --------------------------------
[4] Start all four Brokers.
    - Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/
    - Execute: bin/kafka-server-start.sh config/server.properties 
    - Execute: bin/kafka-server-start.sh config/server-1.properties 
    - Execute: bin/kafka-server-start.sh config/server-2.properties 
    - Execute: bin/kafka-server-start.sh config/server-3.properties 
[5] Check if all brokers are running:
    - Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/
    - Execute: ./bin/zookeeper-shell.sh localhost:2181 ls /brokers/ids
```
*List of all Brokers* </br>
![image](https://user-images.githubusercontent.com/45539698/66250957-62fe6e00-e767-11e9-928d-19b88e9070aa.png)

##### STEP#4: Create Topic
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/kafka-topics.sh --zookeeper localhost:2181 --create --topic topic1 --replication-factor 4 --partitions 3 
```

##### STEP#5: Create Producer
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/kafka-console-producer.sh --broker-list localhost:9092 --topic topic1
```
##### STEP#6: Create Consumer
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute:  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic1 --from-beginning
```
##### STEP#7: Now send something from Producer and observe Consumer Terminal:

![image](https://user-images.githubusercontent.com/45539698/66251066-52e78e00-e769-11e9-8e6e-2fb3728638f8.png)

*WHAT IF*  </br>
 bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic someothertopic --from-beginning
![image](https://user-images.githubusercontent.com/45539698/65813241-363ed980-e1f0-11e9-8806-a4fd584ab632.png)


*SUMMARY* </br>
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/bin
[2] Execute: ./kafka-topics.sh --describe --zookeeper localhost:2181 --topic topic1
```
![image](https://user-images.githubusercontent.com/45539698/66251615-bb396e00-e76f-11e9-9285-3a9b240cf51d.png)
*(SIMILAR)PICTORIAL REPRESENTATION*
![image](https://user-images.githubusercontent.com/45539698/66251920-52ec8b80-e773-11e9-8f60-876385469d94.png)

##### STEP#8: Testing with KAFKA-CONNECT:
    -Create a source file [Any location | With Permissions | With some data].
    -Create a blank file [Any location | With Permissions]
    -Give the path of source file in /usr/local/kafka/kafka_2.12-2.3.0/config/connect-file-source.properties
    -Give the path of destination file in /usr/local/kafka/kafka_2.12-2.3.0/config/connect-file-sink.properties
    -Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/
    -Execute: bin/connect-standalone.sh config/connect-standalone.properties config/connect-file-source.properties config/connect-file-sink.properties
    - Observe the data in souce.txt has been moved into destination.txt.
    -NOTE: If you keep adding stuff in source.txt, the changes wont reflect in real time on destination.txt.
    
    
