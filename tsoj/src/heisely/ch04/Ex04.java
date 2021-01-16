package heisely.ch04;

import java.util.*;

// FlowEx4. if-else if문
public class Ex04 {
	public static void main(String[] args) {
		int score = 0; // 점수를 저장하기 위한 변수
		char grade = ' '; // 학점을 저장하기 위한 변수. 공백으로 초기화

		System.out.print("점수를 입력하세요.> ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();

		if (score >= 90) { // 90점 이상이면 A
			grade = 'A';
		} else if (score >= 80) { // 80점 이상이면 B
			grade = 'B';
		} else if (score >= 70) { // 70점 이상이면 C
			grade = 'C';
		} else if (score >= 60) { // 60점 이상이면 D
			grade = 'D';
		} else { // 그 외엔 F
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}
