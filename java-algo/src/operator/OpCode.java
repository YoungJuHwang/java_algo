package operator;
/**
 * @file_name : OpCode.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 연산자 문법
 */
public class OpCode {
	public static void main(String[] args) {
		/*
		 * && : 둘 다 참일 때 실행
		 * || : 둘 중 하나만 참이어도 실행
		 */
		int a, b; // 타입이 동일한 변수를 선언할 때 묶음처리 가능.
		a = b = 10;
		int c = a + b;
		
		System.out.println("결과 값 : " +c);
	}
}
