package com.devwind;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CarCollectionRef {
	List <Car> carListRef;
	Set <Car> carSetRef;
	Map <Car,Engine>carMapRef;
	
	public List<Car> getCarListRef() {
		System.out.println("++++++++++++++++");
		System.out.println("Car List out put:");
		System.out.println("++++++++++++++++");
		for(int i=0; i<carListRef.size();i++) {
			System.out.println("*****CAR LIST NO " + i + " *****");
			carListRef.get(i).carInfo();
		}
		
		return carListRef;
	}
	public void setCarListRef(List<Car> carListRef) {
		this.carListRef = carListRef;
	}
		
	public Set<Car> getCarSetRef() {
		System.out.println("++++++++++++++++");
		System.out.println("Car SET out put:");
		System.out.println("++++++++++++++++");
		for(int i=0; i<carSetRef.size();i++) {
			System.out.println("*****CAR SET NO " + i + " *****");
			carListRef.get(i).carInfo();
		}
		return carSetRef;
	}
	
	public void setCarSetRef(Set<Car> carSetRef) {
		this.carSetRef = carSetRef;
	}

	public Map<Car,Engine> getCarMapRef() {
		System.out.println("++++++++++++++++");
		System.out.println("Car MAP out put:");
		System.out.println("++++++++++++++++");
		for(int i=0; i<carMapRef.size();i++) {
			System.out.println("*****CAR MAP NO " + i + " *****");
			System.out.println("KEY: " + carListRef.get(i) + " VALUE: " + carMapRef.get(carListRef.get(i)));
		}
		return carMapRef;
	}
	public void setCarMapRef(Map<Car, Engine> carMapRef) {
		this.carMapRef = carMapRef;
	}

}
