package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {
	
	public static void main(String[] args) {
		
		System.out.println("친구를 3명 등록해주세요");
		Scanner sc=new Scanner(System.in);
		
		Friend[] a=new Friend[3];
		
		for(int i=0; i<a.length; i++) {
			String first=sc.nextLine();
			String[] b=first.split(" ");
			a[i]=new Friend(b[0], b[1], b[2]);
		}
		for(int i=0; i<a.length; i++) {
			a[i].showInfo();
		}
		sc.close();
	}
	
}
