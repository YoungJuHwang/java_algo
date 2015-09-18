package comparison;

import java.util.Scanner;

/**
 * @file_name : IfTest4.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 18.
 * @story     : if-else 로 SSN 성별 분석하기
 */
public class IfTest4 {
	public static void main(String[] args) {
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
	
		System.out.println("이름 입력 : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("주민번호 입력 : ex)000000-0000000");
		String number = scan.nextLine();
		String g = null;
		
		char ch = number.charAt(7); // 문자열에서 몇번째 문자인지 알려주는 메소드.
			// number 문자열에서 7번째의 문자를 ch에 삽입. int형으로 받는건 나중에 알려줌.
		
		if(ch == '1' || ch == '3'){
			g = "남자";
		}
		else if (ch == '2' || ch == '4') {
			g = "여자";
		}
		else if (ch == '5' || ch == '6') {
			g = "외국인";
		}
		else {
			System.out.println("다시 입력하시오");
			return;
		}
	
		System.out.println(name + "은" + g + "입니다.");
	
	
	
	
	
	}
}
