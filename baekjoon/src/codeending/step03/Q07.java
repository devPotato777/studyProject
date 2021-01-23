package codeending.step03;

import java.util.Scanner;

/* for문 A+B - 7
 * 
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 		 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 * 
 * 입력 예제 : 5
 *			1 1
 *			2 3
 *			3 4
 *			9 8
 *			5 2
 * 출력 예제 : Case #1: 2
 * 			Case #2: 5
 * 			Case #3: 7
 * 			Case #4: 17
 * 			Case #5: 7
 */
public class Q07 {

	public static void main(String[] args) {
		N11021();
	}
	public static void N11021() {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.printf("Case #%d: %d\n", i, A+B);
		}
		
		sc.close();
	}

}
