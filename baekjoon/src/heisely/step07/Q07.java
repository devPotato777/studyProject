package heisely.step07;

import java.util.Scanner;

// 문자열
// 2908.
public class Q07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		int na = (a % 10) * 100 + ((a % 100) / 10) * 10 + (a / 100);
		int nb = (b % 10) * 100 + ((b % 100) / 10) * 10 + (b / 100);

		System.out.println(na > nb ? na : nb);
	}
}
