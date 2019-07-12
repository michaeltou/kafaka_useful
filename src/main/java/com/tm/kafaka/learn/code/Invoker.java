package com.tm.kafaka.learn.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by douming on 2019/7/11.
 * 功能描述：
 */
@RestController
public class Invoker {
    @Autowired
    KafkaSender sender;
    @Autowired
    KafkaReceiver receiver;


    @RequestMapping("/send")
    public void send(@RequestParam("message") String message){
       sender.send(message);
    }
}
