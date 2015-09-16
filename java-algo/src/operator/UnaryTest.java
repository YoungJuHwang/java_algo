package operator;
/**
 * @file_name : UnaryTest.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 단항연산자 예제
 */
public class UnaryTest {
	 public static void main(String[] args) {
		
		 /*
		  * 문제 : 정수형 변수 x=5, y=10, z=0 일 때
		  * z = x후위 + x전위 + y후위 식을 연산자를 사용해 완성하고
		  * z의 결과값 출력 후 이유 설명.
		  */
		
		 int x = 5, y = 10, z = 0;
		
		 z = x++ + ++x + y++; // 연산의 x++ 자체가 한 사이클이 되서 넘어가기 전 5 입력 후  
		 				      // 한 사이클이 증가해서 6이됨. 그 다음 ++x에서 7로 됨.
		 
		 System.out.println("결과는" + z + "입니다.");
		 System.out.println(y);
		
	}
}
