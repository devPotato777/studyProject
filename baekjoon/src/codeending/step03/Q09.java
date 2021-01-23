package codeending.step03;

import java.util.Scanner;

/* for문 별 찍기 - 1
 * 
 * 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 
 * 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 * 입력 예제 : 5
 * 출력 예제 : *
 *			**
 *			***
 *			****
 *			*****
 */
public class Q09 {

	public static void main(String[] args) {
		N2438();
	}
	public static void N2438() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i+1; j++ ) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
