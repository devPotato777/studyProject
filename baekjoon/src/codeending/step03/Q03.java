package codeending.step03;

import java.util.Scanner;

/* for문 합
 * 
 * 문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 
 * 출력 : 1부터 n까지 합을 출력한다.
 * 
 * 예제 입력1 : 3
 * 예제 출력1 : 6
 * 
 */
public class Q03 {

	public static void main(String[] args) {
		N8393();
	}
	public static void N8393() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
