package heisely.ch03;

import java.util.Scanner;

// 논리연산자 - OperatorEx25
public class Ex25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = ' ';

		System.out.print("문자를 하나 입력하세요.> ");

		String input = scan.nextLine();
		ch = input.charAt(0);

		if ('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
	}
}
