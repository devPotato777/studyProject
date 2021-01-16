package devPotato777.step03;

import java.util.Scanner;

/*
	10950번
	A+B - 3
	
	문제
	두 정수 A와 B를 입력받은 다음, 
	A+B를 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 
	각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	
	출력
	각 테스트 케이스마다 A+B를 출력한다.

	알고리즘 분류
	- 수학
	- 구현
	- 사칙연산
*/

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("테스트 할 횟수를 입력해주세요. > ");
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.println("정수 A, B를 입력해주세요. (0 < A, B < 10)");
			System.out.print("(입력 예시 : 1 1) > ");
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (0 < A && B < 10) {
				System.out.println("A + B = " + (A + B));
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 실행해주세요.");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");

		sc.close();
	}
}