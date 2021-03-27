package com.example.learning.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${engine.power}")
    int power;
    @Bean
    Engine engine() {
     Engine engine = new Engine();
     engine.setEngineType("From Configuration");
     return engine;
    }

    @Bean
    Car car() {
        return new Car(engine(), power);
    }
}
