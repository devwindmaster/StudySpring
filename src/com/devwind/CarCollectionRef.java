package com.devwind;

import java.util.List;

public class CarCollectionRef {
	List <Car> carListRef;

	public List<Car> getCarListRef() {
		for(int i=0; i<carListRef.size();i++) {
			System.out.println("CAR NO " + i );
			carListRef.get(i).carInfo();
		}
		
		return carListRef;
	}
	public void setCarListRef(List<Car> carListRef) {
		this.carListRef = carListRef;
	}
}
