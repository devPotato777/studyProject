package scento03.step05;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] arr;

		int testcase = s.nextInt();

		for (int i = 0; i < testcase; i++) {

			int N = s.nextInt();
			arr = new int[N];

			double sum = 0;

			for (int j = 0; j < N; j++) {
				int val = s.nextInt();
				arr[j] = val;
				sum += val;
			}

			double mean = (sum / N);
			double count = 0;

			for (int j = 0; j < N; j++) {
				if (arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / N) * 100);
		}
	}

}
