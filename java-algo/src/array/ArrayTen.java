package array;

import java.util.Scanner;

/**
 * @file_name : ArrayTen.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     : int 타입 배열 요소의 합.
 */
public class ArrayTen {
	/*
	 * 1부터 10까지 합 구하기(옵션 : 배열)
	 */
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("합은 : " +sum);
		
	}
}
