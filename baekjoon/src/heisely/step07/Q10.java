package heisely.step07;

import java.util.Scanner;

// 문자열
// 1316. 그룹단어 체커
public class Q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt(); // test할 횟수
		int cnt = test;

		for (int i = 0; i < test; i++) {
			String word = scan.next();
			boolean[] check = new boolean[26];

			for (int j = 1; j < word.length(); j++) {
				if (word.charAt(j - 1) != word.charAt(j) && check[word.charAt(j) - 'a'] == true) {
					cnt--;
					break;
				}
				check[word.charAt(j - 1) - 'a'] = true;
			}
		}
		System.out.println(cnt);
	}
}
