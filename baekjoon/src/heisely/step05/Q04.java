package heisely.step05;

import java.util.Scanner;

// 1차원배열
// 3052. 나머지
public class Q04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt() % 42;
		}
		scan.close();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
