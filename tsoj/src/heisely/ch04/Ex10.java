package heisely.ch04;

import java.util.Scanner;

// FlowEx10. switch문(5) >> FlowEx9(ch04/Ex09) 활용
public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요.(0~100)> ");
		int score = scan.nextInt();
		
		char grade = ' ';
		switch(score/10) {
			case 10: case 9:
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
