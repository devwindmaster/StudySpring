package com.devwind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author @DevWind
 * Khởi tạo class car, với 2 dependences là Engine và Frame.
 * 2 dependences này sẽ được set nhờ khai báo tạo Beans.xml
 */
public class Car implements ApplicationListener<ApplicationEvent> {
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		if (event.getClass().equals(ContextRefreshedEvent.class)) {
			System.out.println("ContextRefreshedEvent received!");
		} else if (event.getClass().equals(ContextStartedEvent.class)) {
			System.out.println("ContextStartedEvent received!");
		} else if (event.getClass().equals(ContextStoppedEvent.class)) {
			System.out.println("ContextStoppedEvent received!");
		} else if (event.getClass().equals(ContextClosedEvent.class)) {
			System.out.println("ContextClosedEvent received!");
		} else {
			System.out.println("Something else:" + event.toString());
		}
	}
	
	
	private String brand;
	@Autowired
	@Qualifier("engine1")
	private Engine e;
	
	@Qualifier("frame2")
	@Autowired
	private Frame f;
	
	/**
	 * Giả sử, ngay tại phía trên method setBrand này, mình quy định @Required, 
	 * Exception: org.springframework.beans.factory.BeanCreationException sẽ phát sinh.
	 * Exception này sẽ phát sinh ngay sau khi constructor được gọi và trước khi các fields được set.
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// Để nguyên setter dù đã đăng ký @Autowired thì cũng không có lỗi phát sinh 
	public void setEngine(Engine e) {
		this.e = e;
	}

	/**
	 * Không phải default constructor, nhưng là một constructor không nhận params.
	 * @todo Xác nhận : muốn sử dụng constructor-base DI thì phải bỏ constructor không nhận param đi đúng ko? 
	 * 		 Confirmed: Không cần. Beans sẽ tự chọn ra constructor cần dùng.
	 * @TODO Xác NHẬN : KHÔNG ĐƯỢC SỬ DỤNG @Autowired ở đây. Exception IlligalStateExecption. 
	 */
	public Car() {
		System.out.println("Redefine constructor without param!");
	}
	
	//@Autowired
	public Car(String brand, Engine engine, Frame frame) {
		this.e = engine;
		this.f = frame;
		this.brand = brand;
		System.out.println("CONSTRUCTOR WITH PARAMS.");
	}
	
	/**
	 * Method cho biết các thông tin với Car.
	 */
	public void carInfo() {
		System.out.println("CAR BRAND: " + this.brand);
		e.printEngineInfo();
		f.printFrameInfo();
	}
}
