package devPotato777.step03;

import java.util.Scanner;

/*
	2439번
	별 찍기 - 2
	
	문제
	첫째 줄에는 별 1개, 
	둘째 줄에는 별 2개, 
	N번째 줄에는 별 N개를 찍는 문제
	
	
	입력
	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
	
	출력
	첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

	알고리즘 분류
	- 구현
	- 문자열
*/

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상 100 이하의 숫자를 입력하세요. > ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			} // for j

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			} // for k
			
			System.out.println();
		} // for i
		sc.close();
	}
}