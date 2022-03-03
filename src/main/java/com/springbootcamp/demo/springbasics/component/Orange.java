package com.springbootcamp.demo.springbasics.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
class Orange implements Fruit {
    public Orange(){
//        get();
    }
    @Override
    public void get(){
        System.out.println("Orange Received");
    }
}
