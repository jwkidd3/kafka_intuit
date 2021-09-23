# Exercise: Using kafka-topics with Multi-Broker Cluster

In this exercise you will use **kafka-topics** shell script to manage a topic on a multi-broker Kafka cluster.

Duration: **30 mins**

## Procedure

1. Configure a 3-broker Kafka cluster
  * Use custom **broker.id** 
1. Review the available options of **kafka-topics** shell script
  * Use **--help** option to print usage information
1. Create a topic **t1** with 3 partitions and replication factor of 2
  * Use **--create** command-line option
  * `./bin/kafka-topics.sh --bootstrap-server localhost:9092 --create --topic t1 --partitions 3 --replication-factor 2`
1. List all available topics
  * Use **--list** command-line option
1. Review topic configuration of **t1** topic
  * Use **--describe** command-line option
  * `./bin/kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic t1`
  * Focus on Leader, Replicas, Isr
