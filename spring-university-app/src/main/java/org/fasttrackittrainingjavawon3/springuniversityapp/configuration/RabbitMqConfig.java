package org.fasttrackittrainingjavawon3.springuniversityapp.configuration;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class  RabbitMqConfig {
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("university-app");
    }
}
