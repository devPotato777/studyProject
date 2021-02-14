package codeending.step07;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		N5622();
	}
	public static void N5622() {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int sum = str.length();
		
		for(int i=0; i < str.length(); i++) {
			
			if(str.charAt(i) >= 65 && str.charAt(i) <= 67)
				sum += 2;
			else if(str.charAt(i) >= 68 && str.charAt(i) <= 70)
				sum += 3;
			else if(str.charAt(i) >= 71 && str.charAt(i) <= 73)
				sum += 4;
			else if(str.charAt(i) >= 74 && str.charAt(i) <= 76)
				sum += 5;
			else if(str.charAt(i) >= 77 && str.charAt(i) <= 79)
				sum += 6;
			else if(str.charAt(i) >= 80 && str.charAt(i) <= 83)
				sum += 7;
			else if(str.charAt(i) >= 84 && str.charAt(i) <= 86)
				sum += 8;
			else if(str.charAt(i) >= 87 && str.charAt(i) <= 90)
				sum += 9;
			else if(str.charAt(i) == '1')
				sum +=1;
			else sum += 10;
			
		}
		System.out.println(sum);
	}

}
