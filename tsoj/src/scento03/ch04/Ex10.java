package scento03.ch04;

import java.util.*;

public class Ex10 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';

		System.out.print("당신의 점수를 입력하세요.(1~100)>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);

		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
		}

		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}
