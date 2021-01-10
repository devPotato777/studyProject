package devPotato777.step01;

import java.util.Scanner;

/*
	10430번
	나머지
	
	문제
	(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
	(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
	세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
	
	출력
	첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
	
	알고리즘 분류
	- 수학
	- 구현
	- 사칙연산
*/

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		               
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n", (A+B)%C, ((A%C) + (B%C))%C, (A*B)%C, ((A%C) * (B%C))%C);
		sc.close();

	}

}
