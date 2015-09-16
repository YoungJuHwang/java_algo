package variable;
/**
 * @file_name : CastingDemo.java
 * @author    : pheonix0717@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 캐스팅 문법
 */
public class CastingDemo {
	/**
	 * 형변환(Type conversion) : 데이터를 다른 종류의 상자로 옮기는 것
	 * 자동 형변환(묵시적)=promotion 과 수동 형변환(명시적)=casting으로 나뉨.
	 *   
	 * 프로그램에서 데이터 타입이 큰 변수를 작은 타입으로 할당할 때
	 * 명시적으로 타입을 지정하는 것.
	 *  - 데이터의 손실 발생.
	 * 개발자는 직접 다운캐스팅을 하지 말고, 이클립스를 통해
	 * 자동으로 add Cast 한다.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
	
	int a; // 선언
	a = 7; // 할당
	int b = 8; // 선언+할당 => 할당
	double d = 3.15d;
	float f = 3.14f; //bit 수가 다르기 때문에 구분지어 주기 위함.
	
	a = (int) d;
	System.out.println("다운캐스팅 결과 : " +a);
	}

}
