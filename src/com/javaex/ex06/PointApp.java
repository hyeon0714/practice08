package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		//① equals 메소드는 표시가 없을 뿐 Object 클래스에 포함되어 있어서 굳이 메소드를 만들어주지 않아도 사용이 가능하다
		//② new로 만들어진 객체는 각자가 다른 주소값을 가지므로 비교했을때 false가 나온다
		//③ p4는 p1의 결과와 주소를 덮어쓰기로 가져와서 비교했을때 true가 나온다
	}

}


