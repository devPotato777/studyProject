package scento03.step04;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int A = s.nextInt();
			int B = s.nextInt();
			
			if(A==0 && B==0) {
				break;
			}
			System.out.println(A+B);
		}
	}

}
