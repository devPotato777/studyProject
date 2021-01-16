package devPotato777.step02;

import java.util.Scanner;

/*
	9498번
	시험 성적
	
	문제
	시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 시험 점수가 주어진다. 
	시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	
	출력
	시험 성적을 출력한다.

	알고리즘 분류
	- 구현
*/

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시험 점수를 입력해주세요.\n단, 0 <= 시험점수 <= 100\n> ");
		int score = sc.nextInt();

		if (!(score >= 0 && score <= 100))
			System.out.println("잘못 입력하셨습니다.\n(0 <= 시험점수 <= 100)\n다시 실행해주세요.");

		else if (score >= 90 && score <= 100)
			System.out.println("A");
		else if (score >= 80 && score <= 89)
			System.out.println("B");
		else if (score >= 70 && score <= 79)
			System.out.println("C");
		else if (score >= 60 && score <= 69)
			System.out.println("D");
		else
			System.out.println("F");

		sc.close();
	}
}