package com.devwind;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoCar {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Car carAutowireByName = (Car) context.getBean("carAuto");
		carAutowireByName.carInfo();
		
		context.close();
	}
}
