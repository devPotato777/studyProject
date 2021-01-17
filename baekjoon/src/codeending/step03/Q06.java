package codeending.step03;

import java.util.Scanner;

/* for문 기찍 N
 * 
 * 문제 : 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 
 * 출력 : 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 * 
 * 입력 예제 : 5
 * 출력 예제 : 5
 * 			4
 * 			3
 * 			2
 * 			1
 */
public class Q06 {

	public static void main(String[] args) {
		N2742();
	}
	public static void N2742() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		for(int i=N; 0<i; i--) {
			System.out.println(i);
		}
	}

}
