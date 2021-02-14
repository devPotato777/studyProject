package codeending.step07;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		N2941();
	}
	public static void N2941() {
		Scanner sc = new Scanner(System.in);
		
		String[] sArr = { "c=" , "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = sc.next();
		
		for(int i=0; i< sArr.length; i++) {
			if(str.contains(sArr[i]))
				str=str.replaceAll(sArr[i]," ");
//			System.out.println("이해가 안가"+str);
		}
		
		 System.out.println(str.length());
	}

}
