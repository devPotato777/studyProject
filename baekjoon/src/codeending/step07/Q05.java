package codeending.step07;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 문제 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 * 
 * 입력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 
 * 출력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * 
 * 예제 입력 : Mississipi
 * 예제 출력 : ?
 * 
 * 예제 입력 : zZa
 * 예제 출력 : Z
 * 
 * 
 */
public class Q05 {

	public static void main(String[] args) {
		N1157();
	}
	public static void N1157() {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int[] arr = new int[str.length()];
		int[] cArr= new int[26];
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
				arr[i]=(int)str.charAt(i) - 32;
			else
				arr[i]=(int)str.charAt(i);
			
			cArr[(arr[i]-65)]++;
		}
		
		int max = 0;
		char ch = ' ';
		
		for(int i=0; i<cArr.length; i++) {
			System.out.println(cArr[i]);
		}

		for(int i=0; i<cArr.length; i++) {
				if(cArr[i] > max) {
					max = cArr[i];
					ch = (char)(i+65);
//					System.out.println("안같아 "+cArr[i] +"d"+ch);
				}
				else if(cArr[i] == max) {
					ch = '?';
//					System.out.println("같아 "+cArr[i]+"d"+ch);
				}
					
			
	    }
		
		System.out.println(ch);
		
	
	}

}
