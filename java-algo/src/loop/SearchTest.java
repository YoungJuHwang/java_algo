package loop;

import java.util.Scanner;

public class SearchTest {
	/*
	 * 제시된 문장에서 특정 알파벳 존재 갯수
	 * "p 는 9개 존재합니다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dest = "peter piper picked a peck of pickled peperes";
		int pCount = 0;
		System.out.println("비교할 알파벳 번째 입력");
		int input = scan.nextInt();
		for (int i = 0; i < dest.length(); i++) {
			if(dest.charAt(i) == dest.charAt(input)){
				pCount++;
			}
			
		}
		System.out.println(dest.charAt(input)+"는 " + pCount +"개 존재합니다");
	}
}
