package scento03.step04;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int tmp = N;
		int c = 0;
		
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) %10);
			c++;
			
			if (tmp == N) {
				break;
			}
		}
		System.out.println(c);
		
	}

}
