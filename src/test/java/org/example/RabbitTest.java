package org.example;

import org.example.producer.MessageProducer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RabbitTest {
    private ApplicationContext context=null;

    @Test
    public void sendMessage(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageProducer producer = (MessageProducer) context.getBean("messageProducer");
        producer.sendMessage("测试啦");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
