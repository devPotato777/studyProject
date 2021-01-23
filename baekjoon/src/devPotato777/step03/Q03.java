package devPotato777.step03;

import java.util.Scanner;

/*
	8393번
	합
	
	문제
	n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
	
	출력
	1부터 n까지 합을 출력한다.

	알고리즘 분류
	- 수학
	- 구현
*/

public class Q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 (1 <= 숫자 <= 10000)\n> ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + (sum) + "입니다.");
		
		sc.close();
	}
}