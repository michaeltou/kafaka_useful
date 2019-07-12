package com.tm.kafaka.learn.code;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * created by douming on 2019/7/11.
 * 功能描述：
 */
@Component
public class KafkaReceiver {

    /**
     * When using manual AckMode, the listener can also be provided with the Acknowledgment; this example also shows how to use a different container factory.

     @KafkaListener(id = "baz", topics = "myTopic",
     containerFactory = "kafkaManualAckListenerContainerFactory")
     public void listen(String data, Acknowledgment ack) {
     ...
     ack.acknowledge();
     }



     * @param ack
     */
    @KafkaListener(topics = {"test2"} )
    public void listen(String message, Acknowledgment ack) {
       /* Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("收到消息是："+ message);

        }*/
        System.out.println("收到消息是："+ message);
        ack.acknowledge();
    }
}
