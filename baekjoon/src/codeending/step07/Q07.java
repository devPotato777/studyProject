package codeending.step07;

import java.util.Scanner;

/*
 * 문제 : 
 */
public class Q07 {

	public static void main(String[] args) {
		N2908();
	}
	public static void N2908() {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[2];
		
		for(int i=0; i <arr.length; i++) {
			arr[i] = sc.nextInt() + "";
			arr[i] = arr[i].charAt(2)+""+arr[i].charAt(1)+""+arr[i].charAt(0)+"";
		}
		
		if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) )
			System.out.println(arr[0]);
		else
			System.out.println(arr[1]);
	}	

}
