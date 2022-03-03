package com.springbootcamp.demo.springbasics.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class JuiceShop {
    @Autowired
    private Fruit fruit;

    @Autowired
    private Fruit fruit2;

    private String juiceShopName;
    private int juicePricePerGlass;


    public JuiceShop(Fruit fruit){
        this.fruit = fruit;
        fruit.get();
    }

    public Fruit getFruit2() {
        return fruit2;
    }

    public void setFruit2(Fruit fruit2) {
        this.fruit2 = fruit2;
    }

    public String getJuiceShopName() {
        return juiceShopName;
    }

    public void setJuiceShopName(String juiceShopName) {
        this.juiceShopName = juiceShopName;
    }

    public int getJuicePricePerGlass() {
        return juicePricePerGlass;
    }

    public void setJuicePricePerGlass(int juicePricePerGlass) {
        this.juicePricePerGlass = juicePricePerGlass;
    }
}