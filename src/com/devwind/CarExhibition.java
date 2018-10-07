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
		cc.getCarList();
		cc.getCarPriceSet();
		cc.getCarPriceMap();
		cc.getCarOriginProp();
		// Tránh memory leaks.
		
		CarCollectionRef ccr = (CarCollectionRef) context.getBean("carCollectionRef");
		ccr.getCarListRef();
		ccr.getCarSetRef();
		context.close();
	}
}
