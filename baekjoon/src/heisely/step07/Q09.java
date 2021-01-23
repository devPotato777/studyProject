package heisely.step07;

import java.util.Scanner;

// 문자열
// 2941. 크로아티아 알파벳
public class Q09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'c' && i < str.length() - 1 && (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {
				i++;
			}
			if (str.charAt(i) == 'd') {
				if (i < str.length() - 2 && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
					i += 2;
				} else if (i < str.length() - 1 && str.charAt(i + 1) == '-') {
					i++;
				}
			}
			if ((str.charAt(i) == 'l' || str.charAt(i) == 'n') && i < str.length() - 1 && str.charAt(i + 1) == 'j') {
				i++;
			}
			if (str.charAt(i) == 's' && i < str.length() - 1 && str.charAt(i + 1) == '=') {
				i++;
			}
			if (str.charAt(i) == 'z' && i < str.length() - 1 && str.charAt(i + 1) == '=') {
				i++;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
