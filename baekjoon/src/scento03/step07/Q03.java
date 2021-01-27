package scento03.step07;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String S = s.nextLine();
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}

}
