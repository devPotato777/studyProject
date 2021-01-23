package codeending.step03;

import java.util.Scanner;

/* for문 별 찍기 - 2
 * 
 * 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 * 
 * 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 * 입력 예제 : 5
 * 출력 예제 :     *
 *             **
 *            ***
 *           ****
 *          *****
 * 
 */
public class Q10 {

	public static void main(String[] args) {
		N2439();
	}
	public static void N2439() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<N-i; j++) {
				System.out.print(" ");
			}
			for(int t=0; t<i+1; t++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
