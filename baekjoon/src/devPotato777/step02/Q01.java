package devPotato777.step02;

import java.util.Scanner;

/*
	1330번
	두 수 비교하기
	
	문제
	두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
	
	출력
	첫째 줄에 다음 세 가지 중 하나를 출력한다.

	- A가 B보다 큰 경우에는 '>'를 출력한다.
	- A가 B보다 작은 경우에는 '<'를 출력한다.
	- A와 B가 같은 경우에는 '=='를 출력한다.
	
	제한
	-10,000 ≤ A, B ≤ 10,000
	
	알고리즘 분류
	
*/

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 A, B를 입력하시오.\n단, 범위는 -10,000 ≤ A, B ≤ 10,000 입니다.\n> ");
		int A = sc.nextInt();
		int B = sc.nextInt();

		int min = -10_000;
		int max = 10_000;

		if (!((min <= A && max >= A) && (min <= B && max >= B)))
			System.out.println("잘못 입력하셨습니다. 다시 실행해주세요. \n범위는 -10,000 ≤ A, B ≤ 10,000 입니다.");

		else if (A > B)
			System.out.println(A + " > " + B);
		else if (A < B)
			System.out.println(A + " < " + B);
		else
			System.out.println(A + " == " + B);

		sc.close();
	}
}