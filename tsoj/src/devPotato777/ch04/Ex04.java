package devPotato777.ch04;

import java.util.*;	// Scanner클래스를 사용하기 위해 추가

/* if~else if문
 * 
 * if (조건식1) {
 * 		// 조건식1의 연산결과가 참일 때 수행될 문장들을 적는다.
 * } else if (조건식2) {
 * 		// 조건식2의 연산결과가 참일 때 수행될 문장들을 적는다.
 * } else if (조건식3) {			// 여러 개의 else if를 사용할 수 있다.
 * 		// 조건식3의 연산결과가 참일 때 수행될 문장들을 적는다.
 * } else {	// 마지막에는 보통 else블럭으로 끝나며, else 블럭은 생략가능하다.
 * 		// 위의 어느 조건식도 만족하지 않을 때 수행될 문장들을 적는다.
 * }
 */


public class Ex04 {

	public static void main(String[] args) {
		int score = 0;		// 점수를 저장하기 위한 변수
		char grade = ' ';	// 학점을 저장하기 위한 변수, 공백으로 초기화한다.
		
		System.out.print("점수를 입력하세요. > ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	// 화면을 통해 입력받은 숫자를 score에 저장
		
		if(score >= 90) {			// score가 90점 보다 같거나 크면 A학점
			grade = 'A';
		} else if (score >= 80) {	// score가 80점 보다 같거나 크면 B학점
			grade = 'B';
		} else if (score >= 70) {	// score가 70점 보다 같거나 크면 C학점
			grade = 'C';
		} else {					// 나머지는 D학점
			grade = 'D';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");

	}

}
