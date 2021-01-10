package devPotato777.step01;

import java.util.Scanner;

/*
	1001번
	A-B
	
	문제
	두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
	
	출력
	첫째 줄에 A-B를 출력한다.
	
	알고리즘 분류
	- 수학
	- 구현
	- 사칙연산
*/

public class Q06 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A-B);
		sc.close();

	}

}
