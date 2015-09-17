package comparison;

import java.util.Scanner;

/**
 * @file_name : IfDemo.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 17.
 * @story     : 단일if문 예제
 */
public class IfDemo {
	public static void main(String[] args) {
		/*
		 * 변수명은 num
		 * 컨디션은 10 이상이면
		 * "입력한 수는 10 이상입니다."
		 */
		/*
		 * continue, break(스위치 문에서만 사용), return(스위치 문 제외한 나머지)
		 */
		System.out.println("숫자 하나를 입력하시오");
		Scanner scan = new Scanner(System.in);
		System.out.println("기준값을 입력하시오");
		Scanner scan2 = new Scanner(System.in);
		int num = scan.nextInt();
		int gijun = scan2.nextInt();
		
		if(num > gijun)
		{
			System.out.println(num+"은(는)"+gijun+"초과입니다.");
		}
		else if(num == gijun)
		{
			System.out.println(num+"은(는)"+gijun+"와 같습니다.");
		}
		else
		{
			System.out.println(num+"은(는)"+gijun+"미만입니다.");
		}
		
		
	}
}
