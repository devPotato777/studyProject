package heisely.step08;

import java.util.Scanner;

// 2839. 설탕배달
public class Q04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배달할 설탕의 무게를 입력하세요.(3~5000)> ");
		int n = scan.nextInt();
		if(n<9) {
			switch(n%5) {
				case 0: System.out.println(n/5); break;
				case 1: System.out.println(n/3); break;
				case 2: System.out.println(-1); break;
				case 3: System.out.println(n/5+n%5/3); break;				
				case 4: System.out.println(-1);
			}
		} else {
			switch(n%5) {
				case 0: System.out.println(n/5); break;
				case 1: System.out.println(2+(n-3*2)/5); break;
				case 2: System.out.println(4+(n-3*4)/5); break;
				case 3: System.out.println(1+(n-3*1)/5); break;
				case 4: System.out.println(3+(n-3*3)/5);
			}
		}
	}
}
