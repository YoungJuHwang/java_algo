package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopOddEvenSum.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     :	등차수열 n - m 에서 홀수합, 짝수합 따로 구하기.
 */
public class ForLoopOddEvenSum {
	/*
	 * 등차수열 n - m 요소의 합 구하는 프로그램 만들기
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sumEven = 0, sumOdd = 0, temp = 0, input1, input2;
		System.out.println("첫번째 수를 입력 : ");
		input1 = scan.nextInt();
		System.out.println("두번째 수를 입력 : ");
		input2 = scan.nextInt();
		int array[];
		array = new int[54];
		
		if(input1 > input2){
			temp = input1;
			input1 = input2;
			input2 = temp;
		}
		for (int i = input1; i <= input2; i++) {
			if((i % 2) == 0){
				sumEven += i;
			}
			else{
				sumOdd += i;
			}
		}
		System.out.println(input1 + "부터" + input2 + "까지의 짝수합은 : " + sumEven);
		System.out.println(input1 + "부터" + input2 + "까지의 홀수합은 : " + sumOdd);
	}
}
