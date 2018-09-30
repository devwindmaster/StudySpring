package com.devwind;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author @DevWind
 * Will made a change here.!
 * Xem xét class CarFactory. 
 * Car tạo ra tại đây sẽ gọi method carInfo() cho biết thông tin về engine và frame.
 */
public class CarFactory {
	public static void main(String[] args) {
		// Khởi tạo context dựa trên tham chiếu của Beans.xml
		// Beans.xml cần được đặt ngay dưới package để container có thể tìm thấy.
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		Car myHumbleCar = (Car)context.getBean("car");
		myHumbleCar.carInfo();
		// Car tạo ra hoàn toàn không thể set lại giá trị của Engine và Frame.
		// Qua đó, đảm bảo tính encapsulate (che giấu thông tin nội tại) của class. 
		
		context.registerShutdownHook();
		context.close();
	}
}
