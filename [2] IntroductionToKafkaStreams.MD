## Kafka Streams


##### STEP#1: Zookeeper should be running:
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/zookeeper-server-start.sh config/zookeeper.properties 
```
*Zookeeper started on port 2181*
![image](https://user-images.githubusercontent.com/45539698/66250650-2892d200-e763-11e9-9a29-2255515a6c16.png)


##### STEP#2:Broker/s should be Running [Here only one]:
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/config
[2] Now, create a Broker:
    cp server.properties server-1.properties
   
[3] Now edit the below properties in the above broker files:
    - sudo gedit server-1.properties
    - broker.id=81
    - listeners=PLAINTEXT://:8081
    - log.dirs=/tmp/kafka-logs-81   
[4] Start the Broker:  
    - Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/
    - Execute: bin/kafka-server-start.sh config/server-1.properties 
    
 ```
  
##### STEP#2: Input & Output topics should be Running :
###### Input Topics:
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/kafka-topics.sh --create --bootstrap-server localhost:8081 --replication-factor 1 --partitions 1 --topic plaintext-input
[3] Execute: bin/kafka-topics.sh --create --bootstrap-server localhost:8081 --replication-factor 1 --partitions 1 --topic wordcount-input
[4] Execute: bin/kafka-topics.sh --create --bootstrap-server localhost:8081 --replication-factor 1 --partitions 1 --topic linesplit-input

```
###### Output Topics:
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/kafka-topics.sh --create --bootstrap-server localhost:8081 --replication-factor 1 --partitions 1 --topic plaintext-output --config cleanup.policy=compact
[3] Execute: bin/kafka-topics.sh --create --bootstrap-server localhost:8081 --replication-factor 1 --partitions 1 --topic wordcount-output --config cleanup.policy=compact
[4] Execute: bin/kafka-topics.sh --create --bootstrap-server localhost:8081 --replication-factor 1 --partitions 1 --topic linesplit-output --config cleanup.policy=compact
```
##### STEP#3: Producer/Consumer should be Running :
###### Producer:
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/kafka-console-producer.sh --broker-list localhost:8081 --topic plaintext-input

[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/kafka-console-producer.sh --broker-list localhost:8081 --topic wordcount-input

[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/kafka-console-producer.sh --broker-list localhost:8081 --topic linesplit-input
```
###### Consumer:

```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/kafka-console-consumer.sh --bootstrap-server localhost:8081 --topic  plaintext-output --from-beginning --formatter kafka.tools.DefaultMessageFormatter --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer
	
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0    
[2] Execute: bin/kafka-console-consumer.sh --bootstrap-server localhost:8081 --topic wordcount-output --from-beginning --formatter kafka.tools.DefaultMessageFormatter --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer
	
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0    
[2] Execute: bin/kafka-console-consumer.sh --bootstrap-server localhost:8081 --topic linesplit-output --from-beginning --formatter kafka.tools.DefaultMessageFormatter --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer
	       
```



    
