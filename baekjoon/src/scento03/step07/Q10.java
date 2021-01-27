package scento03.step07;

import java.util.Scanner;

public class Q10 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		

		int count = 0;
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = s.next();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			if (prev != now) {
				
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				
				else {
					return false;
				}
			}
			
			else {
				continue;
			}
		}
		return true;
	}

}
