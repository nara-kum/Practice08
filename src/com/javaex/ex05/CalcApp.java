package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		// 수식입력
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		String eq = sc.nextLine();

		char calculator = 0;
		String cal = "";

		int left;
		int right;
		

		for (int i = 0; i < eq.length(); i++) {
			char ch = eq.charAt(i);
			String a = "\\";
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				calculator = ch;
				cal = Character.toString(calculator);
				cal = a.concat(cal);
				break;
			}
		}
		
		try {
			if(eq.equals("q")) {
				System.out.println("종료합니다.");
			}else {

				String[] cArray = eq.split(cal);
				left = Integer.parseInt(cArray[0].trim());
				right = Integer.parseInt(cArray[1].trim());
				
				switch (cal) {
				case "\\+":
					Add add = new Add();
					add.setValue(left, right);
					System.out.println(add.calculate());
					break;
					
				case "\\-":
					Sub sub = new Sub();
					sub.setValue(left, right);
					System.out.println(sub.calculate());
					break;
					
				case "\\*":
					Mul mul = new Mul();
					mul.setValue(left, right);
					System.out.println(mul.calculate());
					break;
					
				case "\\/":
					Div div = new Div();
					div.setValue(left, right);
					System.out.println(div.calculate());
					break;
					
				default:
					System.out.println("알 수 없는 연산자입니다");
				}
				
			}
		} catch (NumberFormatException e) {
			System.out.println("알 수 없는 연산자입니다");
		}

		sc.close();

	}
}
