package scento03.step03;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		int T = s.nextInt();
		
		for (int i = 0; i < T; i ++) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			System.out.println(a + b);
		}
		
	}

}
