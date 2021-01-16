package heisely.step03;

import java.util.Scanner;

// for문
// 2741. N 찍기
public class Q05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력하세요.> ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
