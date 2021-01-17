package scento03.step03;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}

}
