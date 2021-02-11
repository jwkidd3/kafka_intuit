/**
*  Kafka Consumer with Example Java Application
*/
public class KafkaConsumerDemo {
    public static void main(String[] args) {
        Consumer consumerThread = new Consumer("testTopic");
        consumerThread.start();
    }
}
