package heisely.step03;

import java.util.Scanner;

// for문
// 2438. 별 찍기(1) - 왼쪽 정렬
public class Q09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("별을 찍을 줄의 수를 입력하세요.> ");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
