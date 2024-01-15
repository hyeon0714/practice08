package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Add a=new Add();
    	Sub b=new Sub();
    	Mul c=new Mul();
    	Div d=new Div();
    	boolean run=true;

    	Scanner sc=new Scanner(System.in);
    	System.out.println("계산 시작");
    	while(run) {
    		System.out.print(">>");
    		String go=sc.nextLine();
    		String ggo=go.replace(" ", "");
    		int aa=ggo.indexOf("+");
    		int bb=ggo.indexOf("-");
    		int cc=ggo.indexOf("*");
    		int dd=ggo.indexOf("/");
    		int ee=ggo.indexOf("&");
    		
    		if(aa>=0) {
    			int no01=Integer.parseInt(ggo.substring(0, aa));
    			int no02=Integer.parseInt(ggo.substring(aa+1));
    			a.setValue(no01, no02);
    			System.out.print(">>");
    			System.out.println(a.calculate());
    			
    		}else if(bb>=0) {
    			int no01=Integer.parseInt(ggo.substring(0, bb));
    			int no02=Integer.parseInt(ggo.substring(bb+1));
    			b.setValue(no01, no02);
    			System.out.print(">>");
    			System.out.println(b.calculate());
    			
    		}else if(cc>=0) {
    			int no01=Integer.parseInt(ggo.substring(0, cc));
    			int no02=Integer.parseInt(ggo.substring(cc+1));
    			c.setValue(no01, no02);
    			System.out.print(">>");
    			System.out.println(c.calculate());
    		
    		}else if(dd>=0) {
    			int no01=Integer.parseInt(ggo.substring(0, dd));
    			int no02=Integer.parseInt(ggo.substring(dd+1));
    			d.setValue(no01, no02);
    			System.out.print(">>");
    			System.out.println(d.calculate());
    			
    		}else if(ee>=0) {
    			System.out.println("알 수 없는 연산입니다");
    			
    		}else {
    			System.out.println("계산 종료");
    			run=false;
    		}
    		
    	
    	}sc.close();
    	

    }

}
