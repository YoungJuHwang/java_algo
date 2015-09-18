package comparison;

import java.util.Scanner;

/**
 * @file_name : SwitchTest.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 18.
 * @story     : switch 로 성별 판별 프로그램
 */
public class SwitchTest {
	/*
	 * To. 개발자님
	 * 프로그램 하나 개발해야 합니다.
	 * 교수가 주민번호를 입력하면 해당 학생이 남자,여자,외국인인지
	 * 자동으로 출력해주는 프로그램을 만들어 달랍니다.
	 * 홍길동 : 800101-1654812 => 남
	 * 입력값은 이름과 주민번호이고 남은 자동으로 출력되는 값입니다.
	 * 현행법상 1, 3으로 시작되면 남자. 2, 4로 시작되면 여자.
	 * 5, 6이면 외국인 입니다.
	 * 그 외의 입력시 "다시 입력하세오"라고 알려주시길 바랍니다.
	 */
	public static void main(String[] args) {
		/*
		 * 표기법(notation)
		 * 정수 타입 표기법 : 1,2,3...
		 * 실수 타입 표기법 : 1.0 2.0 3.0 ...
		 * 문자 타입 표기법 : '1' '2'
		 * 문자열 타입 표기법 : "123"
		 */
		System.out.println("이름 입력 : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("주민번호 입력 : ex)000000-0000000");
		String number = scan.nextLine();
		String g = null;
		
		char ch = number.charAt(7);
		
		switch(ch)
		{
		case '1': case '3':
			g = "남자"; 
			break;
		case '2': case '4':
			g = "여자"; 
			break;
		case '5': case'6':
			g = "외국인"; 
			break;
		default:
			System.out.println("다시 입력하시오");
			return;
		}
		System.out.println(name + "은" + g + "입니다.");
	}
}
