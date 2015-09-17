package comparison;

import java.util.Scanner;

/**
 * @file_name : SwitchDemo.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 17.
 * @story     : switch문
 */
public class SwitchDemo {  //return하면 요기로 옴.
	public static void main(String[] args) 
	{
			//int month = Integer.parseInt(args[0]);
			// 리터럴 : 문자열리터럴
		
		/*
		 * 월을 입력하면 해당 월 몇일까지 알려주는 프로그램
		 * 단) 2월은 무조건 29일로 한다.
		 */
		
		System.out.println("1 ~ 12월을 입력");
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		String res = null; //지역변수는 반드시 초기화 필요!!
		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			res = "31"; 
			break;
		case 4: case 6: case 9: case 11:
			res = "30"; 
			break;
		case 2:
			res = "29"; 
			break;
		default:
			System.out.println("다시 실행하세요");
			return;
		}
		System.out.println(month+"월은" + res +"일까지 입니다.");		
	}
}
		
		
		