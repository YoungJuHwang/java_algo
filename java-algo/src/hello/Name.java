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
		Scanner scan = new Scanner(System.in);
		String asd = scan.next();
		System.out.println(asd);
	}
}
