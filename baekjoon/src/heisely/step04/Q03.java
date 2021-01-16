package heisely.step04;

import java.util.Scanner;

// while문 >> do-while문
// 1110. 더하기 사이클
public class Q03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0이상 99이하의 수를 입력하세요.> ");
		int n = scan.nextInt();
		int tmp = n;
		int cnt = 0;
		do {
			cnt++;
//			System.out.print((tmp / 10) + " + " + (tmp % 10) + " = " + (tmp / 10 + tmp % 10));
			tmp = tmp % 10 * 10 + (tmp / 10 + tmp % 10) % 10;
//			System.out.println(" , new n = " + tmp);
		} while (tmp != n);
		System.out.println("사이클의 길이: "+cnt);
	}
}
