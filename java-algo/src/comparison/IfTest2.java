package comparison;

import java.util.Scanner;

/**
 * @file_name : IfTest2.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 17.
 * @story     : 1등 구하기
 */
public class IfTest2 {
	/*
	 * To. 개발자님
	 * 프로그램 하나 개발해야 합니다.
	 * 교수는 학생 평균을 입력하면 등수를 알려주는 기능 추가.
	 * 오더는 다음과 같이 화면에 출력.
	 * 학생 이름 : 홍길동 (2)
	 * 학생 이름 : 김유신 (1)
	 * 학생 이름 : 강감찬 (3)
	 * 단) 학생은 총 3명입니다.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name1 = scan.next();
		System.out.println("평균 입력 : ");
		int avg1 = scan.nextInt();
		
		if(avg1<0 || avg1>100){
			System.out.println("다시 입력하시오.");
			return;
		}
		
		System.out.println("이름 입력 : ");
		String name2 = scan.next();
		System.out.println("평균 입력 : ");
		int avg2 = scan.nextInt();
		if(avg2<0 || avg2>100){
			System.out.println("다시 입력하시오.");
			return;
		}
		
		System.out.println("이름 입력 : ");
		String name3 = scan.next();
		System.out.println("평균 입력 : ");
		int avg3 = scan.nextInt();
		if(avg3<0 || avg3>100){
			System.out.println("다시 입력하시오.");
			return;
		}
		

		int first;
		String name = null;
		
		if((avg1 > avg2) && (avg1 > avg3)){
			first = avg1;
			name = name1;
		}
		else if ((avg2 > avg1) && (avg2 > avg3)){
			first = avg2;
			name = name2;
		}
		else if((avg3 > avg1) && (avg3> avg2)){
			first = avg3;
			name = name3;
		}
		else;
			
		System.out.println("1등 :  " +name);
	}
}
