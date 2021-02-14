package scento03.step05;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[10];
		int c = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt() % 42;
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				c++;
			}
		}
		System.out.println(c);
	}

}
