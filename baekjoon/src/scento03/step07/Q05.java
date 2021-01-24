package scento03.step07;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[26];
		String s = scan.next();

		for (int i = 0; i < s.length(); i++) {

			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				arr[s.charAt(i) - 'A']++;
			} else {
				arr[s.charAt(i) - 'a']++;
			}
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}

}
