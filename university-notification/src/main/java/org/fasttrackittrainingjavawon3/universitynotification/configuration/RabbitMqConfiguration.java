package org.fasttrackittrainingjavawon3.universitynotification.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {
    @Bean
    public Queue assignmentsQueue(){
        return new Queue("assignments");
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("university-rabbit");
    }

    @Bean
    public Binding binding(DirectExchange directExchange, Queue assignmentsQueue){
        return BindingBuilder
                .bind(assignmentsQueue)
                .to(directExchange)
                .with("assignments");
    }
}
