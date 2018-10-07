package com.devwind;

/**
 * @author @DevWind
 * Khởi tạo class car, với 2 dependences là Engine và Frame.
 * 2 dependences này sẽ được set nhờ khai báo tạo Beans.xml
 * Will make some change in Car.
 */
public class Car {
	private static int num = 0;
	private String brand;
	private Engine e;
	private Frame f;
	
	/**
	 * nếu getter không thực sự cần thiết, có thể lược bỏ.
	 * @return
	 */
	public Engine getEngine() {
		return e;
	}
	public void setEngine(Engine e) {
		this.e = e;
	}
	/**
	 * nếu getter không thực sự cần thiết, có thể lược bỏ.
	 * @return
	 */
	public Frame getFrame() {
		return f;
	}
	public void setFrame(Frame f) {
		this.f = f;
	}
	/**
	 * Không phải default constructor, nhưng là một constructor không nhận params.
	 * @todo Xác nhận : muốn sử dụng constructor-base DI thì phải bỏ constructor không nhận param đi đúng ko? 
	 * 		 Confirmed: Không cần. Beans sẽ tự chọn ra constructor cần dùng.
	 */
	public Car() {
		System.out.println("Redefine constructor");
	}
	/**
	 * Đồng thời có constructor nhận params.
	 * Constructor này sẽ không được gọi.
	 * @param engine
	 * @param frame
	 */
	public Car(String brand, Engine engine, Frame frame) {
		this.e = engine;
		this.f = frame;
		this.brand = brand;
		System.out.println("Will be called...!" + num++);
	}
	
	/**
	 * Method cho biết các thông tin v�? Car.
	 */
	public void carInfo() {
		System.out.println("CAR BRAND: " + this.brand);
		e.printEngineInfo();
		f.printFrameInfo();
	}
}
