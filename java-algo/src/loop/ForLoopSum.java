package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopTenSum.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     :	등차수열 1 - 10 합 구하기.
 */
public class ForLoopSum {
	/*
	 * 등차수열 n - m 요소의 합 구하는 프로그램 만들기
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0, temp = 0, input1, input2;
		System.out.println("첫번째 수를 입력 : ");
		input1 = scan.nextInt();
		System.out.println("두번째 수를 입력 : ");
		input2 = scan.nextInt();
		
		if(input1 > input2){
			temp = input1;
			input1 = input2;
			input2 = temp;
		}
		for (int i = input1; i <= input2; i++) {
			sum += i;
		}
		System.out.println(input1 + "부터" + input2 + "까지의 합은 : " + sum);
	}
}
