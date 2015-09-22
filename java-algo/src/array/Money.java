package array;

import java.util.Scanner;

/**
 * @file_name : Money.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 금액 입력하면 화폐단위별로 분류.
 */
public class Money {
	public void CountMoney() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액 입력 : ");
		int price = scan.nextInt();
		//int []moneyUnit = new int[10];
		int []moneyUnit = {50000,10000,5000,1000,500,100,50, 10};
		int []result = new int[moneyUnit.length];
		
		for (int i = 0; i < moneyUnit.length; i++) {
			result[i] = price / moneyUnit[i];
			price = price % moneyUnit[i];
			System.out.println(moneyUnit[i] + "원 : " + result[i] + "매");
		}
	
	}	
	
}
