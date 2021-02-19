package devPotato777.step12;

import java.util.Scanner;

/*
2750번
수 정렬하기

문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 
수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N입력 > ");
		int N = sc.nextInt();
		
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				} // if
			} // for j
		} // for i

		for (int val : arr) {
			System.out.println(val);
		}
		
		sc.close();

	}

}
