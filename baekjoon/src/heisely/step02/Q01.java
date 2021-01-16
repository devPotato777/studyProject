package heisely.step02;

import java.util.Scanner;

// if문
// 1330. 두 수 비교하기
public class Q01 {
	public static void main(String[] args) {
		System.out.print("두 정수를 입력하세요.(스페이스바로 구분)> ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("=");
		}
	}
}
