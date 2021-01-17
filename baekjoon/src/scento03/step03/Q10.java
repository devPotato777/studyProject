package scento03.step03;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		for (int a = 1; a <= N; a++) {
			for (int b = 1; b <= N-a; b++); {
				System.out.print(" ");
			}
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
		}
			System.out.println();
			
	}

}
