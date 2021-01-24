package scento03.step06;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print(arithmetic_sequence(s.nextInt()));

	}

	public static int arithmetic_sequence(int num) {
		int cnt = 0;

		if (num < 100) {
			return num;
		} else {
			cnt = 99;
			if (num == 1000) {
				num = 999;
			}

			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}

		return cnt;
	}

}
