package codeending.step07;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		N1316();
	}
	public static void N1316() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = num;
		for(int i=0; i<num; i++) {
			String str = sc.next();
			boolean[] check = new boolean[26];
			
			for(int j=1; j < str.length(); j++) {
				if(str.charAt(j-1) != str.charAt(j)){
					if(check[str.charAt(j)-97] == true) {
						cnt--;
						break;
					}
					check[str.charAt(j-1) -97] = true;
				}
			}
			
		}
		System.out.println(cnt);
	}
}
