package scento03.step05;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String arr[] = new String[s.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.next();
		}

		for (int i = 0; i < arr.length; i++) {

			int cnt = 0;
			int sum = 0;

			for (int j = 0; j < arr[i].length(); j++) {

				if (arr[i].charAt(j) == '0') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}

}
