package devPotato777.step07;

import java.util.Scanner;

/*
10809번
알파벳 찾기

문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 
각각의 알파벳에 대해서, 
단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 
단어의 길이는 100을 넘지 않으며, 
알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서,
a가 처음 등장하는 위치, 
b가 처음 등장하는 위치, 
... 
z가 처음 등장하는 위치를 
공백으로 구분해서 출력한다.

만약, 
어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 
단어의 첫 번째 글자는 0번째 위치이고, 
두 번째 글자는 1번째 위치이다.
 */

public class Q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		
		/* indexOf를 사용하면 해당 문자가 처음으로 등장하는 위치를 리턴한다.
		   만약 해당 문자가 문자열에 없으면 -1을 리턴한다. */
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(S.indexOf(c) + " ");
		}

		sc.close();
		
	} // main의 끝

}
