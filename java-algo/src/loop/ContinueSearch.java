package loop;

import java.util.Scanner;

/**
 * @file_name : ContinueSearch.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 25.
 * @story     : continue를 이용한 간단한 검색엔진 원리 이해0
 */
public class ContinueSearch {
	/*
	 * 검색어 [동해]가 존재하는지 여부 체크
	 */
	public static void main(String[] args) {
		String dest = "12345";
				
		Scanner scan = new Scanner(System.in);
		boolean isExist = false;
		while(true){
			System.out.println("검색어 입력하세요 : ");
			String search = scan.nextLine();
			if (search.equals("q")) {
				return;
			} else {
				isExist = false;
				int max = dest.length() - search.length();
				test:
				for (int i = 0; i <= max; i++) {  
					int searchCount = search.length(); //검색어 낱말의 갯수
					int destStartPoint = i; //검색을 마친 후 다음 검색대상 낱말의 위치
					int searchStatrPoint = 0;
					
					while (searchCount-- != 0){
						if (dest.charAt(destStartPoint++) != search.charAt(searchStatrPoint++)) {  //dest.charAt() : dest에서 ()번째 글자 하나만 집어옴.
							continue test;
						}
					}
					isExist = true;
					break test;
				}
				System.out.println(isExist ? "검색어 ["+search+"] 존재 : " : "존재하지 않음");
			}
			
		}
		
	}
}
