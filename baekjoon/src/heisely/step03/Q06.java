package heisely.step03;

import java.util.Scanner;

// for문
// 2742. 기찍 N - 2741. N찍기 반대
public class Q06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력하세요.> ");
		int n = scan.nextInt();
		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}
}
