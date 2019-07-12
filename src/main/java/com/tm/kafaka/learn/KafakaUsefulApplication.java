package com.tm.kafaka.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafakaUsefulApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context  = SpringApplication.run(KafakaUsefulApplication.class, args);

		/*for (int i = 0; i < 30; i++) {
			//调用消息发送类中的消息发送方法
			KafkaSender sender = context.getBean(KafkaSender.class);
            //调用消息发送类中的消息发送方法
			sender.send("testdata");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/

	}

}
