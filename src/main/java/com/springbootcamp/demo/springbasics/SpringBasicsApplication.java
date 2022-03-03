package com.springbootcamp.demo.springbasics;

import com.springbootcamp.demo.springbasics.component.Banana;
import com.springbootcamp.demo.springbasics.component.Fruit;
import com.springbootcamp.demo.springbasics.component.JuiceShop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(SpringBasicsApplication.class, args);

		JuiceShop juiceShop = applicationContext.getBean(JuiceShop.class);

		juiceShop.setFruit2(applicationContext.getBean(Banana.class));
		Fruit fruit2 = juiceShop.getFruit2();
		fruit2.get();

	}

}
