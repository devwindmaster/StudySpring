package com.devwind;

import java.util.List;
import java.util.Set;

public class CarCollectionRef {
	List <Car> carListRef;
	Set <Car> carSetRef;

	public Set<Car> getCarSetRef() {
		System.out.println("Car SET out put:");
		for(int i=0; i<carSetRef.size();i++) {
			System.out.println("*****CAR SET NO " + i + " *****");
			carListRef.get(i).carInfo();
		}
		return carSetRef;
	}
	public void setCarSetRef(Set<Car> carSetRef) {
		this.carSetRef = carSetRef;
	}
	public List<Car> getCarListRef() {
		System.out.println("Car List out put:");
		for(int i=0; i<carListRef.size();i++) {
			System.out.println("*****CAR LIST NO " + i + " *****");
			carListRef.get(i).carInfo();
		}
		
		return carListRef;
	}
	public void setCarListRef(List<Car> carListRef) {
		this.carListRef = carListRef;
	}
}
