package com.tm.kafaka.learn.code;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;



/**
 * created by douming on 2019/7/11.
 * 功能描述：
 */
@Component
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    //发送消息方法
    public void send(String message) {
        /*Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());*/
        System.out.println("发送消息 消息内容是：message = "+JSON.toJSONString(message));
        kafkaTemplate.send("test2", JSON.toJSONString(message));
    }

}
