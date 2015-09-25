package array;
/**
 * @file_name : ArrayMiSmith.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 25.
 * @story     :	이중배열 예제
 */
public class ArrayMiSmith {
	public static void main(String[] args) {
		String[][] names = {
				{"Mr.","Mrs.","Ms."},
				{"Smith","Jones","Alex"},
				{"hello","hi","good-bye"}
		};
		System.out.println(names[0][0] + names[1][0] + names[2][2]);
		
		System.out.println(names[0][2] + names[1][2] + names[2][0]);
		
	}
}
