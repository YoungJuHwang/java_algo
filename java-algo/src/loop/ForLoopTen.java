package loop;
/**
 * @file_name : ForLoopTen.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 1부터 10까지 정수의 나열 => 수열
 */
public class ForLoopTen {
	/*
	 * for, loop의 장점
	 * 초기화, 한계값, 증감값 설정을 한 컨디션 내부에 일괄 설정.
	 * 가독성 좋고, 코딩 빠르게 됨.
	 * 따라서, while loop 보다 권장.
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"\t");
		}
	}
}
