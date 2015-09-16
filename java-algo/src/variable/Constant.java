package variable;

import java.util.Scanner;

/**
 * @file_name : Constant.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 상수 문법
 */
public class Constant {
	public static void main(String[] args) {
		/*
		 * 상수(constant)
		 * 데이터 그 자체이며 불변임.
		 * 
		 *  1. 정수형 상수 : 2, 5
		 *  2. 실수형 상수 : 3.4, 5.1
		 *  3. 문자 상수 : 'a'
		 *  4. 리터럴 상수 : "abc"
		 *  
		 */
		
		final int ONE_HUNDRED = 100; // final 붙이면 상수, 없으면 변수 선언하는 것.
		final double TAX_RATE = 0.09;
		
		System.out.println("연봉 입력");
		Scanner scan = new Scanner(System.in);
		int salary = scan.nextInt();
		int tax = (int) (salary * TAX_RATE);
		System.out.println("내야 할 세금은 " + tax + "만원 입니다");
		
		
		final int ONE = 1;
		String str = "str";
	}
}
