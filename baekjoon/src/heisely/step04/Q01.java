package heisely.step04;

import java.util.Scanner;

// while문
// 10952. A+B(5) - 10951. A+B(4) 확장
public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("한 자리 정수를 두 개 입력하세요.(띄어쓰기로 구분/종료: 0 0)> ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (a == 0 && b == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("a+b = " + (a + b));
			}
		}
	}
}
