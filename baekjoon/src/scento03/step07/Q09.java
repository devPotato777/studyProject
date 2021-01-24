package scento03.step07;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'c') {
				if(i < str.length() -1) {
					if(str.charAt(i +1) == '=') {
						i++;
					}
					else if (str.charAt(i+1) == '-') {
				}
				}
			}
			
			else if(ch == 'd') {
				if(i < str.length() -1) {
					if(str.charAt(i+1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i +2) == '=') {
								i +=2;
							}
						}
					}
					else if (str.charAt(i +1)== '-') {
						i++;
					}
				}
					}
					else if(ch == '1') {
						if(i < str.length() - 1) {
							if(str.charAt(i + 1) == 'j') {
								i++;
							}
						}
					}
					else if(ch == 's') {
						if(i < str.length() - 1) {
							if(str.charAt(i + 1)== '=' ) {
								i++;
							}
				}
			}
					else if(ch == 'z') {
						if(i < str.length() -1) {
							if(str.charAt(i +1)== '=') {
								i++;
							}
						}
					}
			count++;
		}
		System.out.println(count);
	}

}
