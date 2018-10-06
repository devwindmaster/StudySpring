package com.devwind;

/**
 * @author @DevWind
 * Định nghĩa class phụ thuộc Engine. Với method cho biết 
 * đây là Engine được sản xuất ở đâu. 
 * Giá engine là nhiêu xèng.
 */
public class Engine {
	// DEFAULT constructor (không khai báo.)
	
	/**
	 * Price là 1 primitive type, nó có thể được pass trực tiếp từ Beans.xml
	 * Muốn vậy, price phải có setter ứng với tên của nó, và có thể gọi từ bên ngoài class. 
	 * Nghĩa là phải có một public setterPrice giành cho nó
	 * NOTE: Getter có thể miễn khai báo.
	 */
	private int price;
	
	/**
	 * Tương tự cho enginOrigin
	 */
	private String engineOrigin;
	
	public String getEngineOrigin() {
		return engineOrigin;
	}

	public void setEngineOrigin(String engineOrigin) {
		this.engineOrigin = engineOrigin;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printEngineInfo() {
		System.out.println("Engine made in " + engineOrigin + " with price:" + price + "$");
	}
}
