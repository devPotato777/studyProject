package codeending.step08;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		sol1();
	}
	public static void N2292() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int A = 2;
		
		int cnt = 1;

		if (num == 1) {
			System.out.print(1);
		}
 
		else {
			while (A <= num) {	
				A = A + (6 * cnt);	
				cnt++;	 
			}
			System.out.print(cnt);
		}
		}
	
	
	public static void sol1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int A = 2;
		int B = 7;
		int cnt = 2;
		
			for(; ; ) {
				if(num ==1) {cnt =1; break;}
				if(A <= num && B >= num)
					break;
				else {
					A = A + (6*(cnt-1));
					B = B + (6*cnt);
					cnt++;
				}
				
			}

		System.out.println(cnt);
	}

}
