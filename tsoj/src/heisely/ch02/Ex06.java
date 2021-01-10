package heisely.ch02;

import java.util.Scanner;

//ScannerEx
public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("두 자리 정수를 하나 입력해 주세요.> ");
		String input = scan.nextLine(); // scanner를 통해 입력받은 문자열
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

		System.out.println("입력 내용: " + input);
		System.out.printf("num=%d\n", num);
	}
}
