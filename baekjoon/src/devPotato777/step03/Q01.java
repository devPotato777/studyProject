package devPotato777.step03;

import java.util.Scanner;

/*
	2739번
	구구단
	
	문제
	N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
	출력 형식에 맞춰서 출력하면 된다.
	
	입력
	첫째 줄에 N이 주어진다. 
	N은 1보다 크거나 같고, 9보다 작거나 같다.
	
	출력
	출력형식과 같게 N*1부터 N*9까지 출력한다.

	알고리즘 분류
	- 수학
	- 구현
	- 사칙연산
*/

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("단을 입력해주세요. (1 <= 단 > 9) > ");
		int N = sc.nextInt();
		
		if(!(1<= N && N <= 9)) {
			System.out.println("N은 1보다 크거나 같고, 9보다 작습니다.\n다시 실행해주세요.");
		} else {
			for(int i = 1; i <= 9; i++) {
					System.out.println(N + " * " + i + " = " + N * i );
			}
		}

		
		// do-while문
//		int N = 0;
//
//		do {
//			System.out.println("구구단 단을 입력해주세요. 종료를 원하시면 0을 눌러주세요.");
//			N = sc.nextInt();
//			if (N == 0) {
//				System.out.println("프로그램이 종료되었습니다.");
//				break;
//			} else if (!(1 <= N && N <= 9)) {
//				System.out.println("잘못 입력하셨습니다. 1~9 중에 입력해주세요.");
//				continue;
//			} else {
//				for (int i = 1; i <= 9; i++) {
//					System.out.println(N + " * " + i + " = " + N * i);
//				}
//			}
//		} while (N != 0);
		
		sc.close();
	}
}