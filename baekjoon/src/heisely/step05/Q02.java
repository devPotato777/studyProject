package heisely.step05;

import java.util.Scanner;

// 1차원 배열
// 2562. 최댓값
public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int idx = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				idx = (i + 1);
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}
}
