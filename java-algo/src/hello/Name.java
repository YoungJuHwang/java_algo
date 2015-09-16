package hello;

import java.util.Scanner;
/**
 * @file_name : Name.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 15.
 * @story     : input, output event.
 */
public class Name {
	public static void main(String[] args) {
		
		System.out.println("이름 입력");
		Scanner name = new Scanner(System.in);
		String asd = name.next();
		System.out.println("나이 입력");
		Scanner age = new Scanner(System.in);
		String as = age.next();
		
		System.out.println("반갑습니다. " + asd + "님 " + "제 나이는 " + as + "살 입니다.");
	}
}
