package operator;
/**
 * @file_name : UnaryTest2.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 16.
 * @story     : [cookbook-java5.0] p.91 연습문제2. 단항연산자 예제
 */
public class UnaryTest2 {
	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println(++a); //전위로 출력 전 a값에 1 더함.
		
		System.out.println(++a + b++); // 12 + 20 = 32 ; 출력 후 a = 12, b = 21;
		
		System.out.println((++a%3) + (a*++b)); // (13%3) + (13*21) => 1 + 286출력 후 a = 13, b = 22;
	}
}
