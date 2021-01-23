package heisely.step07;

import java.util.Scanner;

// 문자열
// 1152. 단어의 개수
public class Q06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine(); // .next()와 nextLine()의 차이 확인하기!
		int cnt = 0; // 단어의 수를 셀 변수 선언
		scan.close();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') { // 공백이 있으면 카운트 증가
				cnt++;
			}
		}
		
		if(s.charAt(0)!=' ' && s.charAt(s.length()-1)!=' ') {
			System.out.println(cnt+1); // 문장 맨 앞과 맨 뒤에 공백이 없으면 전체 카운트에 +1
		} else if(s.charAt(0)==' '&&s.charAt(s.length()-1)==' ') {
			System.out.println(cnt-1); // 문장 맨 앞과 맨 뒤에 모두 공백이 있으면 전체 카운트에 -1
		} else {
			System.out.println(cnt); // 그 외(맨 앞 or 맨 뒤 둘 중 하나에만 공백)에는 그냥 전체 카운트
		}
	}
}
