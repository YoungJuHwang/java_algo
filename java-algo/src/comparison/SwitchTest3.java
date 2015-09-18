package comparison;

import java.util.Scanner;

/**
 * @file_name : SwitchTest3.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 18.
 * @story     : 사칙연산 계산기.
 */
public class SwitchTest3 {
	/*
	 * To. 개발자님
	 * 교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
	 * 복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은 몫과 나머지로 출력.
	 * 출력결과물은 예를 들어
	 * 5 + 5 = 10, 10 / 3 = 3 [1]
	 * 그러면 []값이 나머지 입니다.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int num1 = scan.nextInt();
		System.out.println("사칙연산을 입력하시오");
		String h = scan.next();
		System.out.println("숫자 입력 : ");
		int num2 = scan.nextInt();
		int result = 0;
		int rest = 0;
		switch(h)
		{
		case "+":
			result = num1 + num2;
			break;
		case "-":
			//if (num1>num2) {
				result = num1 - num2;
			//}
			//else{
			//	result = num2 - num1;
			//}
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			rest = num1 % num2;
			System.out.println(num1 + h + num2 + "=" + result +" [" + rest + "]" );
			return;
		}
		
			System.out.println(num1 + h + num2 + "=" + result);
		
		
		
	}
}
