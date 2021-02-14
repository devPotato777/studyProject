package scento03.step07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String S = s.nextLine();
		
		StringTokenizer st = new StringTokenizer(S," ");
		
		System.out.println(st.countTokens());
	}

}
