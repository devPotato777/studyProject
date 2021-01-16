package heisely.step02;

import java.util.Scanner;

// if문
// 9498. 시험 성적
public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시험 성적을 입력하세요.(0~100)> ");
		int score = scan.nextInt();
		char grade = ' ';

		if (90 <= score && score <= 100) {
			grade = 'A';
		} else if (80 <= score && score <= 89) {
			grade = 'B';
		} else if (70 <= score && score <= 79) {
			grade = 'C';
		} else if (60 <= score && score <= 69) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}
