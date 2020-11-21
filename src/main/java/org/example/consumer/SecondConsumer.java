package org.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class SecondConsumer implements MessageListener {
    private Logger logger = LoggerFactory.getLogger(FirstConsumer.class);
    @Override
    public void onMessage(Message message) {
        logger.info("The second consumer received message : " + message);
    }
}
