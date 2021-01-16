package heisely.ch04;

import java.util.Scanner;

// FlowEx28. do-while문(1)
public class Ex28 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100 + 1); // 1~100의 수 중 임의의 수 저장
		int input;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("1~100의 수 중 정수를 입력하세요.> ");
			input = scan.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}
		} while (answer != input); // answer과 input이 다르면 계속 반복 >> answer=input이 될 때까지 반복
		System.out.println("정답입니다!");
	}
}
