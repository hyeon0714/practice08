package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] str=numLine.split(" ");//공백을 기준으로 문자를 잘라서 구분
		for(int i=0; i<str.length; i++) {//잘라서 구분한만큼 반복문(++공백이 2개여도 시작이 0이라 딱 들어맞음)
            sum =sum+ Integer.parseInt(str[i]);//잘라놓은 문자를 숫자로 변환
        
		}
			
			
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
