package heisely.step03;

import java.util.Scanner;

// for문
// 2439. 별 찍기(2) - 오른쪽 정렬
public class Q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("별을 찍을 줄의 수를 입력하세요.> ");
		int num = scan.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= num; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
