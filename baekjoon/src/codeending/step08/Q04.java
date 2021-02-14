package codeending.step08;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		//N2869();
		sol1();
	}
	public static void N2869() {
		Scanner in = new Scanner(System.in);
		 
		int A = in.nextInt();		
		int B = in.nextInt();	
		int V = in.nextInt(); 	
 
		int N = (B) / (A - B);
  
		if ((V - B) % (A - B) != 0) {
			N++;
		}
		System.out.println(N);
	}

	public static void sol1() {
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B= sc.nextInt();
		int V= sc.nextInt();
		int N ;
		if(V%(A-B) == 0) {
		   N = (V/(A-B))- B ;
		}else {
			N = V/(A-B)+1;
		}
		
		System.out.println(N);
	}
}
