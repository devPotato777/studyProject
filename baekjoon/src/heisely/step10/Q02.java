package heisely.step10;

import java.util.Scanner;

// 10870. 피보나치수 5
public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(fibonacci(scan.nextInt()));
		scan.close();
	}

	static int fibonacci(int n) {
		if (n <= 0) { // 0 이하의 수를 입력하면
			return 0; // 0을 반환
		} else if (n == 1) { // 1을 입력하면(첫 번째 피보나치수)
			return 1; // 1을 반환
		} else { // 2이상의 숫자를 입력하면
			return fibonacci(n - 1) + fibonacci(n - 2); // n-1번째 피보나치수와 n-2번째 피보나치수의 합을 반환
		}
	}
}