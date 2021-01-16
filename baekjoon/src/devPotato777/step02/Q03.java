package devPotato777.step02;

import java.util.Scanner;

/*
	2753번
	윤년
	
	문제
	연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
	윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
	예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
	1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
	하지만, 2000년은 400의 배수이기 때문에 윤년이다.
	
	입력
	첫째 줄에 연도가 주어진다. 
	연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
	
	출력
	첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

	알고리즘 분류
	- 수학
	- 구현
*/

public class Q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("연도를 입력하세요. 단, 1 <= 연도 >= 4000\n> ");
		int year = sc.nextInt();

		if (!(year >= 1 && year <= 4000)) {
			System.out.println("잘못 입력하셨습니다.\n(1 <= 연도 >= 4000)\n다시 실행해주세요.");
		} else if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("윤년입니다.");
		} else
			System.out.println("윤년이 아닙니다.");

		sc.close();
	}
}