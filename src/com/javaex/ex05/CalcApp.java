package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	//수식입력
    	Scanner sc = new Scanner(System.in);
    	System.out.print(">> ");
    	String eq = sc.nextLine();
    	
    	//입력된 문자열 --> 문자로 변환 후 배열에 담기
    	char[] cArray = eq.toCharArray();
    	
    	//정수로 변환된 변수를 받을 변수 선언
    	int a = 0;
    	int b = 0;
    	
    	
    	sc.close();

    }
}
