package devPotato777.ch04;

import java.util.*;	// Scanner클래스를 사용하기 위해 추가

/*
 * 중첩 if문
 * 
 * if (조건식1) {
 * 		// 조건식1의 연산결과가 true일 때 수행될 문장들을 적는다.
 * 		if (조건식2) {
 * 			// 조건식1과 조건식2가 모두 true일 때 수행될 문장들
 * 		} else {
 * 			// 조건식1이 true이고, 조건식2가 false일 때 수행되는 문장들
 * 		}
 * } else {
 * 		// 조건식1이 false일 때 수행되는 문장들
 * }
 */

public class Ex05 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요. > ");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	// 화면을 통해 입력받은 점수를 score에 저장
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if (score >= 90) {				// score가 90점 보다 같거나 크면 A학점 (grade)
			grade = 'A';
			if (score >= 98) {			// 90점 이상 중에서도 98점 이상은 A+
				opt = '+';
			} else if (score < 94) {	// 90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score >= 80) {		// score가 80점 보다 같거나 크면 B학점 (grade)
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {						// 나머지는 C학점 (grade)
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}

}
