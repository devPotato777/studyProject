package codeending.step07;

import java.util.Scanner;

/*
 * 문제 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 		 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 
 * 출력 : 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 * 
 * 예제 입력 : baekjoon
 * 
 * 예제 출력 : 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */
public class Q03 {
	
	public static void main(String[] args) {
		N10809();
	}
	public static void N10809() {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] aph = new char[26];
		String[] aphArr = new String[26];
		
		for(int i=0; i<aph.length; i++) {
			aph[i] = (char) (97+i);
		}
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=0; j<aph.length; j++) {
				if(str.charAt(i) == aph[j]) {
					if(aphArr[j] == null)
					aphArr[j] = i+"";
				}
			}
			
		}
		
		str = "";
		for(int i=0; i<aphArr.length; i++) {
	
			str += aphArr[i] == null ? -1 +" " : aphArr[i]+" ";
		}
		
		System.out.println(str);
	}
}
