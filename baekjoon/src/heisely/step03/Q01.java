package heisely.step03;

import java.util.Scanner;

// for문
// 2739. 구구단
public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~9의 수 중 하나를 입력하세요: ");
		int n = scan.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
