package scento03.step03;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int X = s.nextInt();
		
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < X) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
