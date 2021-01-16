package heisely.step03;

import java.util.Scanner;

// for문
// 8393. 합
public class Q03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.> ");
		int n = scan.nextInt();
		System.out.println("1부터 " + n + "까지의 합을 구합니다.");
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합: " + sum);
	}
}
