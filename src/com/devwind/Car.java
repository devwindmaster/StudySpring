package com.devwind;

/**
 * @author @DevWind
 * Khởi tạo class car, với 2 dependences là Engine và Frame.
 * 2 dependences này sẽ được set nhờ khai báo tạo Beans.xml
 * Will make some change in Car.
 */
public class Car {
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
	public Car(Engine engine, Frame frame) {
		this.e = engine;
		this.f = frame;
		System.out.println("Will not be used.");
	}
	
	/**
	 * Method cho biết các thông tin v�? Car.
	 */
	public void carInfo() {
		e.printEngineOrgin();
		f.printFrameOrigin();
	}
}
