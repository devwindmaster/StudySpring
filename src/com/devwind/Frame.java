package com.devwind;

/**
 * @author @DevWind
 * Định nghĩa class phụ thuộc Frame. Với method cho biết 
 * đây là Frame được sản xuất ở đâu. 
 */
public class Frame {
	// DEFAULT constructor (không khai báo.)
	private int framePrice;
	private String frameOrigin;
	
	public Frame(int framePrice,String frameOrigin) {
		this.frameOrigin = frameOrigin;
		this.framePrice = framePrice;
	}
	public void printFrameInfo() {
		System.out.println("Frame made in " + frameOrigin + " with price:" + framePrice + "$");
	}
}
