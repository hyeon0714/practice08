package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	public boolean equals(Object obj) {
		Point a=(Point)obj;
		boolean result;
		if(this.x==a.x) {
			result=true;
		}else {
			result=false;
		}
			
		
		
		
		return result;
	}
	
}
