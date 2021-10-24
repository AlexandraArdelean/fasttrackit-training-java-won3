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
    public DirectExchange direct(){
        return new DirectExchange("university-app");
    }

    @Bean
    public Binding binding(DirectExchange direct,
                           Queue assignmentsQueue){
        return BindingBuilder
                .bind(assignmentsQueue)
                .to(direct)
                .with("assignments");
    }
}
