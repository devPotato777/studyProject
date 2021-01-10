package baekjoon.codeending.step01;

import java.util.Scanner;

/*	A/B
 * 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력 : 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 * 
 * 예제1 입력 : 1 3
 * 예제1 출력 : 0.33333333333333333333333333333333
 * 
 * 예제2 입력 : 4 5
 * 예제2 출력 : 0.8
 */
public class Q08 {

	public static void main(String[] args) {
		N1008();
	}
	
	public static void N1008() {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		sc.close();
		
		System.out.println(A/B);
	}

}
