package codeending.ch02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
		
	}

}
