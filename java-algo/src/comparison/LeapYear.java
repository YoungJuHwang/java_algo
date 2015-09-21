package comparison;

import java.util.Scanner;

/**
 * @file_name : LeapYear.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     :	윤년 판별 프로그램
 */
public class LeapYear {
	/*
	 * 연도를 4로 나눈 값이 0이면 윤년일 수 있다
	 * 그러나 연수가 100으로 나누어 떨어지면 평년이다.
	 * 2000년은 4로 나눈 값이 0 이라 윤년일 수 있는데,
	 * 다시 이 값이 100으로 나눠 떨어지면 평년이다.
	 * 평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("년도를 입력 : ");
		Scanner scan = new Scanner(System.in);
		int year = 0;
		String str = null;
		year = scan.nextInt();
		//이뤟궭햙명뫀앏와쳙뮭궸찖 쭀빯잎쎍끱둟좳댝낧꺆됯쬸랗
		if ((year % 400) == 0) {
			str = "윤년";
		}
		else if((year % 100) == 0){
			str = "평년";
		}
		else if ((year % 4) == 0) {
			str = "윤년";
		}
		else {
			str = "평년";
		}
		System.out.println("입력한 년도는 " + str + "입니다");
		/*if ((year % 4) == 0) {
			str = "윤년";
			if ((year % 100) == 0) {
				str = "평년";
			}
			else
			{
				str = "평년";
			}
		}
		
		else {
			if((year % 400) == 0){
				str = "윤년";
			}
			else {
				str = "평년";
			}
		}*/
	}
	
}
