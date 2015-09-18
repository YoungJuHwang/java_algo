package comparison;

import java.util.Scanner;

/**
 * @file_name : SwitchTest2.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 18.
 * @story     : 
 */
public class SwitchTest2 {
	/*
	 * To. 개발자님
	 * 프로그램 하나 개발해야 합니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 학생		국어	영어	수학	총점	평균	합격여부
	 * ==========================================================
	 * 홍길동	90		90		90		270		90		(장학생)
	 * 합격여부는 다음과 같다고 합니다.
	 * 평균이 90점 이상이면 장학생
	 * 70점 이상 90점 미만이면 합격
	 * 70점 미만이면 불합격이라고 하네요.
	 * 단) 평균에서 소수점 이하는 절삭입니다.
	 */
	public static void main(String[] args) {
		System.out.println("이름을 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력 : ");
		int korea = scan.nextInt();
		
		System.out.println("영어 점수를 입력 : ");
		int eng = scan.nextInt();
		
		System.out.println("수학 점수를 입력 : ");
		int math = scan.nextInt();
		
		int sum = korea + eng + math;
		int avg = (int) (sum / 3);
		
		int temp = (int) (avg/10);
		String result = null;
		
		switch(temp)
		{
		case 9: case 10:
			result = "장학생";
			break;
		case 8: case 7:
			result = "합격";
			break;
		default:
			result = "불합격";
			break;
		}
		
		System.out.println("학생    국어  영어  수학  총점  평균  합격여부");
		System.out.println("================================================================");
		System.out.printf("%s"+"    "+korea+"    "+eng+"    "+math+"    "+sum+"    "+avg+"      "+result, name);
	}
}
