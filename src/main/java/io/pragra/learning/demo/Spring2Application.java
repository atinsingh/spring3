package io.pragra.learning.demo;

import com.example.learning.domain.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ={"com.example.learning.domain"})
@SpringBootApplication
public class Spring2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Spring2Application.class, args);
        System.out.println(context.getBean("car", Car.class));
    }

}
