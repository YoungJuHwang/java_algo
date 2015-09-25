package loop;

import java.util.Scanner;

/**
 * @file_name : GugudanWhatsDan.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 25.
 * @story     : 
 */
public class GugudanWhatsDan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단을 입력 : ");
		int dan = scan.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(dan +" * " + i + " = " +(dan * i));
		}
	}
}
