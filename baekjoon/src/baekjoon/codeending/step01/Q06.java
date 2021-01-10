package baekjoon.codeending.step01;

import java.util.Scanner;

/*	A-B
 * 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력 : 첫째 줄에 A-B를 출력한다.
 * 
 * 예제 입력 : 3 2
 * 예제 출력 : 1
 */
public class Q06 {

	public static void main(String[] args) {
		N1001();
	}
	
	public static void N1001() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		System.out.println(A-B);
	}

}
