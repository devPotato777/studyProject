package scento03.step02;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int H = s.nextInt();
		int M = s.nextInt();
		
		if (M < 45) {
			H = H-1;
			M = M+15;
			if(H <0 ) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M-45));
		}
	}

}
