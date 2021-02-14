package codeending.step08;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		N1712();
	}
	public static void N1712() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		double D ; 
		
		if(C-B >0)
			D = (double)(A)/(C-B)+1;
		else D =-1;
		
		System.out.println(Math.floor(D));
	}


}
