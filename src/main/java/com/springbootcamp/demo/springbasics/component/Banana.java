package com.springbootcamp.demo.springbasics.component;

import org.springframework.stereotype.Component;


@Component
public
class Banana implements Fruit {
    public Banana(){
//        get();
    }
    @Override
    public void get(){
        System.out.println("Banana Received");
    }
}
