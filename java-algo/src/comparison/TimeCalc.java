package comparison;

import java.util.Scanner;

/**
 * @file_name : TimeCalc.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 입력된 시간(초)를 시간, 분 초로 환산하기
 */
public class TimeCalc {
	/**
	 * To. 개발자님께
	 * 초단위로 알려주는 시험이 있는데
	 * 이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
	 * 혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
	 * ex) 500초 입력받으면 ??시간 ??분 ??초로 보여지게요.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input, hour, min, sec;
		final int RAISE = 60;
		System.out.println("시간을 입력 : ");
		input = scan.nextInt();
		
		hour = input / (RAISE*RAISE);
		min = (input - hour*(RAISE*RAISE)) / RAISE;
		sec = input - (hour*(RAISE*RAISE) + min*RAISE);
		
		System.out.println(hour + "시간" + min + "분" + sec + "초 입니다."); 
	}
}
