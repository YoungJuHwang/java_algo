package variable;

import java.util.Scanner;

/**
 * @file_name : TaxTest.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 세금 출력 프로그램
 */
public class TaxTest {
	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 연봉을 입력받아 
	 * [연봉 ? 를 받는 ? 님께서 납부할 세금은 ? 만원입니다.]
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세율이 정권이 바뀔 때 마다 변하니 쉽게 적용가능하게 만들어주세요.
	 * 현 정권은 세율이 9.7%입니다.
	 */
	public static void main(String[] args) {
		
		System.out.println("이름을 입력하세요 : ");
		Scanner s1 = new Scanner(System.in);
		String name = s1.next();
		
		System.out.println("연봉을 입력하세요 : ");
		Scanner s2 = new Scanner(System.in);
		int price = s2.nextInt();
		
		final double TAX_RATE = 0.97;
		int real = (int) (price * TAX_RATE);
		int tax = price - real;
		
		System.out.println("연봉 " + price +"만원을 받는 " + name + "님께서 납부할 세금은" + tax + "만원 입니다");
		
	}
}
