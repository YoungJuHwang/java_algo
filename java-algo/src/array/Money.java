package array;

import java.util.Scanner;

/**
 * @file_name : Money.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 금액 입력하면 화폐단위별로 분류.
 */
public class Money {
	public static void main(String[] args) {
		/*
		 * ex) 123,456원 입력 받으면 
		 *  => 5만원 : 2매, 1만원 : 2매 ...
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("금액 입력 : ");
		int price = scan.nextInt();
		//int []moneyUnit = new int[10];
		int []moneyUnit = {50000,10000,5000,1000,500,100,50, 10};
		int []result = {0, 0, 0, 0, 0, 0, 0, 0};
		int temp = 0;
		
		for (int i = 0; i < moneyUnit.length; i++) {
			temp = price / moneyUnit[i];
			result[i] = temp;
			price -= temp * moneyUnit[i];
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(moneyUnit[i] + "원 : " + result[i] + "매");
		}
		
		
	}
}
