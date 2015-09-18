package comparison;

import java.util.Scanner;

/**
 * @file_name : IfTest3.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 18.
 * @story     : 1,2,3등 출력하기.
 */
public class IfTest3 {
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
		
		int first, second, third;
		String name11 = null;
		String name22 = null;
		String name33 = null;
		
		if((avg1 > avg2) && (avg1 > avg3)){ 
			if (avg2 > avg3){
				first = avg1; second = avg2; third = avg3;
				name11 = name1; name22 = name2; name33 = name3;
			}
			else {
				first = avg1; second = avg3; third = avg2;
				name11 = name1; name22 = name3; name33 = name2;
			}
			
		}
		else if ((avg2 > avg1) && (avg2 > avg3)){
			if (avg1 > avg3) {
				first = avg2; second = avg1; third = avg3;
				name11 = name2; name22 = name1; name33 = name3;
			}
			else {
				first = avg2; second = avg3; third = avg1;
				name11 = name2; name22 = name3; name33 = name1;
			}
			
		}
		else if((avg3 > avg1) && (avg3> avg2)){
			if (avg1 > avg2) {
				first = avg3; second = avg1; third = avg2;
				name11 = name3; name22 = name1; name33 = name2;
			}
			else {
				first = avg3; second = avg2; third = avg1;
				name11 = name3; name22 = name2; name33 = name1;
			}
		}
		else;
			
		System.out.println("1등 :  " +name11);
		System.out.println("2등 :  " +name22);
		System.out.println("3등 :  " +name33);
		
	}
}
