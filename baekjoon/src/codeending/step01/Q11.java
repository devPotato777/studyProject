package codeending.step01;

import java.util.Scanner;

/*곱셈
 * (세자리)X(세자리)
 */
public class Q11 {

	public static void main(String[] args) {
		N2588();
	}
	
	public static void N2588() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		String str = B + "";
		sc.close();
		
		System.out.println(A*Integer.parseInt(str.substring(2,3)) +"\n"
						  +A*Integer.parseInt(str.substring(1,2))+"\n"
						  +A*Integer.parseInt(str.substring(0,1))+"\n"
						  +A*B);
	}
	
	public static void ex1() {
		Scanner sc = new Scanner(System.in);
		 
		int A = sc.nextInt();
		String B = sc.next();
        
		sc.close();
 
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
 
	}
	
	public static void ex2() {
		Scanner sc = new Scanner(System.in);
		 
		int A = sc.nextInt();
		int B = sc.nextInt();
        
		sc.close();
 
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
	}
}
