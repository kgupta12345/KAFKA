## Kafka Streams


##### STEP#1: Zookeeper should be Running:
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0
[2] Execute: bin/zookeeper-server-start.sh config/zookeeper.properties 
```
*Zookeeper started on port 2181*
![image](https://user-images.githubusercontent.com/45539698/66250650-2892d200-e763-11e9-9a29-2255515a6c16.png)


##### STEP#2:Broker/s should be Running :
```
[1] Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/config
[2] Now, create multiple Brokers:
    mv server.properties server-0.properties
    cp server-0.propertiess server-1.properties
    cp server-0.propertiess server-2.properties
    cp server-0.propertiess server-3.properties
[3] Now edit the below properties in the above broker files:
    - sudo gedit server-0.properties
    - broker.id=80
    - listeners=PLAINTEXT://:8080
    - log.dirs=/tmp/kafka-logs-80
    --------------------------------
    - sudo gedit server-1.properties
    - broker.id=81
    - listeners=PLAINTEXT://:8081
    - log.dirs=/tmp/kafka-logs-81
    --------------------------------
    - sudo gedit server-2.properties
    - broker.id=82
    - listeners=PLAINTEXT://:8082
    - log.dirs=/tmp/kafka-logs-82
    --------------------------------
    - sudo gedit server-3.properties
    - broker.id=83
    - listeners=PLAINTEXT://:8083
    - log.dirs=/tmp/kafka-logs-83
    --------------------------------
[4] Start all four Brokers.
    - Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/
    - Execute: bin/kafka-server-start.sh config/server-0.properties 
    
    - Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/
    - Execute: bin/kafka-server-start.sh config/server-1.properties 
    
    - Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/  
    - Execute: bin/kafka-server-start.sh config/server-2.properties 
    
    - Navigate: cd /usr/local/kafka/kafka_2.12-2.3.0/ 
    - Execute: bin/kafka-server-start.sh config/server-3.properties 
    
 ```
  
##### STEP#2:Broker/s should be Running :
###### Create Input Stream:
```
bin/kafka-topics.sh --create --bootstrap-server localhost:8082 --replication-factor 1 --partitions 1 --topic input-stream
```
###### Create Output Stream:
```
bin/kafka-topics.sh --create --bootstrap-server localhost:8082 --replication-factor 1 --partitions 1 --topic output-stream --config cleanup.policy=compact
```
























    
