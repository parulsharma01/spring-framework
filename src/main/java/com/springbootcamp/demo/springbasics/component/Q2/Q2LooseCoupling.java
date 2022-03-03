package com.springbootcamp.demo.springbasics.component.Q2;

public class Q2LooseCoupling {
    public static void main(String[] args) {
        //create common interface for all the fruits //to get the fruits
        Fruit fruit;

        fruit = new Apple();
        fruit.get();
        fruit = new Orange();
        fruit.get();
    }

}
interface Fruit{
    public void get();

}
class Apple implements Fruit{
    @Override
    public void get(){
        System.out.println("Apple Received");
    }
}
class Orange implements Fruit{
    @Override
    public void get(){
        System.out.println("Orange Received");
    }
}
