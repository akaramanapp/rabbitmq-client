package com.rabbitmq.client.consumer;

import com.rabbitmq.client.config.MessagingConfig;
import com.rabbitmq.client.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Client {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {

        System.out.println("Message recieved frsom queue : " + orderStatus);
    }
}
