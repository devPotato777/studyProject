package heisely.step10;

import java.util.Scanner;

// 10872. 팩토리얼
public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(factorial(scan.nextInt()));
	}

	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
