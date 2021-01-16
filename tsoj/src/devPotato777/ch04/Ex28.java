package devPotato777.ch04;

import java.util.*;

/*
 * do-while문
 * while문에서 조건식과 블럭{}의 순서를 바꿔놓은 것이다.
 * 블럭{} 수행한 후에 조건식 평가
 * 최소한 한 번은 수행될 것을 보장한다.
 * 
 * do {
 * 		// 조건식의 연산결과가 참일 때 수행될 문장을 적는다.
 * } while (조건식);	<- 끝에 ';'을 잊지 않도록 주의
 */
// 야구게임
public class Ex28 {

	public static void main(String[] args) {
		int input = 0, answer = 0;

		answer = (int) (Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저장
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("1과 100사이의 정수를 입력하세요. > ");
			input = scanner.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while (input != answer);
		System.out.println("정답입니다.");
	}
}