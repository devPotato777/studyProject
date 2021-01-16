package heisely.step02;

import java.util.Scanner;

// if문
// 2753. 윤년
public class Q03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요.(1~4000)> ");
		int year = scan.nextInt();

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("1: 윤년");
		} else {
			System.out.println("0: 평년");
		}
	}
}
