package com.springbootcamp.demo.springbasics.component.Q1;

public class Q1TightCoupling {
    public static void main(String[] args) {
        //to get the fruits
        Apple apple = new Apple();
        apple.get();

        Orange orange = new Orange();
        orange.get();
    }

}
class Apple{
    void get(){
        System.out.println("Apple Received");
    }
}
class Orange{
    void get(){
        System.out.printf("Orange Received");
    }
}