package com.example.learning.domain;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


// Getter/Setter/RequireArgs


public class Car {


    private Engine engine;

    private int power;

    @PostConstruct
    public void init() {
        System.out.println("Just for demo purpose");
    }

    @PreDestroy
    public void ggsb(){
        System.out.println("Before flusing the bean");
    }

     public Car(Engine engine, int power) {
         this.engine = engine;
         this.power = power;
     }

     @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", power=" + power +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
