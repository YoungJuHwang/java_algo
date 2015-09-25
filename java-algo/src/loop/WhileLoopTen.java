package loop;

import java.util.Scanner;

public class WhileLoopTen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=1, sum = 0;
		while (true) {
			System.out.println("수를 입력 : (메롱)"+"멍청아\t"+i);
			sum = scan.nextInt();
			i++;
			switch (i) {
			case 20:
				
				return;

			default:
				break;
			}
		}
		
		/*i=0;
		for (;i <11; i++) {
			sum += i;
		}
		System.out.println(sum);*/
	}
}
