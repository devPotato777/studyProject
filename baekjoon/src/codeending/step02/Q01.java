package codeending.step02;

import java.util.Scanner;

/* if 두 수 비교하기
 * 
 * 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * 
 * 출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * 		 A가 B보다 큰 경우에는 '>'를 출력한다.
 * 		 A가 B보다 작은 경우에는 '<'를 출력한다.
 *       A와 B가 같은 경우에는 '=='를 출력한다.
 * 
 * 제한 : -10,000 ≤ A, B ≤ 10,000
 * 
 * 입력 예제1 : 1 2
 * 출력 예제1 : <

 * 입력 예제2 : 2 1
 * 출력 예제2 : >
 
 * 입력 예제3 : 5 5
 * 출력 예제4 : ==
 * 
 */
public class Q01 {

	public static void main(String[] args) {
		N1330();
	}
	
	public static void N1330() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if(A < B) System.out.println("<");
		else if(A>B) System.out.println(">");
		else System.out.println("==");
		
	}
	
}
