package com.devwind;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DevWind
 * Class này chỉ dùng để gọi các method từ CarCollection.
 */
public class CarExhibition {

	public static void main(String[] args) {
		// Context của Spring Container:
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CarCollection cc = (CarCollection) context.getBean("carCollection");
		System.out.println("*********PRIMITIVE TYPE START*********");
		cc.getCarList();
		cc.getCarPriceSet();
		cc.getCarPriceMap();
		cc.getCarOriginProp();
		// Tránh memory leaks.
		System.out.println("*********PRIMITIVE TYPE E N D*********");
		CarCollectionRef ccr = (CarCollectionRef) context.getBean("carCollectionRef");
		System.out.println("*********REFERENCE TYPE START*********");
		ccr.getCarListRef();
		ccr.getCarSetRef();
		ccr.getCarMapRef();
		System.out.println("*********REFERENCE TYPE E N D*********");
		context.close();
	}
}
