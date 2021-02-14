package scento03.step05;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int value = (s.nextInt() * s.nextInt() * s.nextInt());
		String str = Integer.toString(value);

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
