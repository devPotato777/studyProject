package heisely.step04;

import java.util.Scanner;

// while문
// 10951. A+B(4)
public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("한 자리 정수를 두 개 입력하세요.(띄어쓰기로 구분)> ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("a+b = " + (a + b));
		}
	}
}
