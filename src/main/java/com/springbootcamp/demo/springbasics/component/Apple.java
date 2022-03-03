package com.springbootcamp.demo.springbasics.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
class Apple implements Fruit {
    public Apple(){
//        get();
    }
    @Override
    public void get(){
        System.out.println("Apple Received");
    }
}
