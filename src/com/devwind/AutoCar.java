package com.devwind;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoCar {
	public static void main(String[] args) {
		/*
		 * Để sử dụng event handling, context cần dùng phải là ConfigurableApplicationContext
		 */
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Car carAutowireByName = (Car) context.getBean("carAuto");
		context.start();
		carAutowireByName.carInfo();
		context.stop();
		context.close();
	}
}
