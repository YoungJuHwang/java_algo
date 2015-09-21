package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopTenSum.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     :	등차수열 1 - 10 합 구하기.
 */
public class ForLoopTenSum {
	/*
	 * 등차수열 1 - n 요소의 합 구하는 프로그램 만들기
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수를 입력 : ");
		int sum = 0, input = 0;
		input = scan.nextInt();
		for (int i = 1; i <= input; i++) {
			sum += i;
		}
		System.out.println(input + "까지의 합은 : " + sum);
	}
}
