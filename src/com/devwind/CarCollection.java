package com.devwind;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author DevWind
 * Tạo một class với các getter cho biết những gì chứa bên trong
 * các collections. 
 */
public class CarCollection {
	List carList;
	Set carPriceSet;
	Map carPriceMap;
	Properties carOriginProp;
	
	public List getCarList() {
		System.out.println("Car list: " + carList);
		return carList;
	}
	public void setCarList(List carList) {
		this.carList = carList;
	}
	public Set getCarPriceSet() {
		System.out.println("Car Price Set:" + carPriceSet);
		return carPriceSet;
	}
	public void setCarPriceSet(Set carPriceSet) {
		this.carPriceSet = carPriceSet;
	}
	public Map getCarPriceMap() {
		return carPriceMap;
	}
	public void setCarPriceMap(Map carPriceMap) {
		this.carPriceMap = carPriceMap;
	}
	public Properties getCarOriginProp() {
		System.out.println("Car Orgin Propertes: " + carOriginProp);
		return carOriginProp;
	}
	public void setCarOriginProp(Properties carOriginProp) {
		this.carOriginProp = carOriginProp;
	}

	
	
}
