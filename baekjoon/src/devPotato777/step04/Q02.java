package devPotato777.step04;

import java.util.Scanner;

/*
	10951번
	A+B - 4
	
	문제
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	
	입력
	입력은 여러 개의 테스트 케이스로 이루어져 있다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	
	출력
	각 테스트 케이스마다 A+B를 출력한다.

	알고리즘 분류
	
*/

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			System.out.print("정수 2개를 입력해주세요. (ex. 1 1)\n> ");
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}
		sc.close();
	}
}