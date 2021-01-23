package scento03.step04;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextInt()) {
			
			int A = s.nextInt();
			int B = s.nextInt();
			System.out.println(A+B);
		}
	}

}
