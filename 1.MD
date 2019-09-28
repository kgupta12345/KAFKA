## Kafka is a Distributed Messaging/Streaming System

#### Kafka Components:
![image](https://user-images.githubusercontent.com/45539698/65809785-d845ce00-e1be-11e9-826b-4c56a09b828a.png)
  - Producers are data generators.
  - Kafka Cluster Holds Data.
  - Consumer gets data (from Cluster)
  - Stream Processors: Kafka gives you streaming APIs, and you can plug processing frameworks like Apache Storm, Spark Streaming.
  - Connectors refer to DBs connector, from which data can be imported/exported from/to kafka.

The producer sends row-by-row of DB Table/ line-by-line in a Text file as **Messages** (an array of bytes)

![image](https://user-images.githubusercontent.com/45539698/65785306-b3773980-e171-11e9-8b90-c8f61f6e4e52.png)

These messages from the Producer Application are sent to the **Kafka Cluster** [first diagram] where in each node, one instance of **Kafka Server/Broker** is running. The messages actually falls in a **topic** (which is a logical name to a storage for a data stream).
As messages are not directly sent to the Consumer Application, the Consumer Application approaches **Kafka Cluster** i.e, to **Kafka Server/Broker** then after to the **topic** to requests for the messages it is *receiving* by the Producer:

![image](https://user-images.githubusercontent.com/45539698/65814325-a6a02780-e1fd-11e9-934d-6e029a4b5c8d.png)
Cluster having Nodes, Each Node is running Broker.


As we mentioned that a topic is a logical name to a data storage, but what is the data inflow is too large, and falls beyond the storage capacity of node. the topic breaks and distributes the messages among other nodes of cluster.
