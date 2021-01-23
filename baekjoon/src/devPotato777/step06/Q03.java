package devPotato777.step06;

import java.util.Scanner;

/*
1065번
한수

문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
N이 주어졌을 때, 1보다 크거나 같고, 
N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, 
N보다 작거나 같은 한수의 개수를 출력한다.
 */

public class Q03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(hansu(n));

		sc.close();

	}

	// 1~n 한수의 개수를 세는 메소드
	static int hansu(int n) {
		int count = 0; // 개수를 저장
		for (int i = 1; i <= n; i++) {
			if (i < 100) {
				count++; // 100 미만 조건 없이 더함
			} else if (i < 1000) {
				// 각 자리 수를 구해서 저장
				int i1 = i % 10;
				int i2 = (i / 10) % 10;
				int i3 = (i / 100) % 10;

				if (i1 - i2 == i2 - i3) {
					count++; // 등차 수열인 경우 더함
				}
			}
		}
		return count;
	}
}
