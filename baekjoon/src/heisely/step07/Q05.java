package heisely.step07;

import java.util.Scanner;

// 문자열
// 1157.
public class Q05 {
	public static void main(String[] args) {
		int[] arr = new int[26]; // 알파벳은 총 26자

		Scanner scan = new Scanner(System.in);
		String s = scan.next(); // 입력받은 문자열을 s에 저장
		for (int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // s에 저장된 문자중 i번째 문자가 대문자면
				arr[s.charAt(i) - 'A']++; // 해당 인덱스를 1 증가
			} else {
				arr[s.charAt(i) - 'a']++; // 소문자면 해당 인덱스 1 증가
			}
		}

		int max = -1; // 최대값변수 선언 및 초기화
		char ch = ' '; // 출력할 문자 선언 및 초기화
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) { // 배열에 저장된 값이 max값보다 크면
				max = arr[i]; // max에 해당 값 저장
				ch = (char) (i + 'A'); // 문자로는 해당 인덱스에 'A'값을 더한 값을 문자로 변환
			} else if (arr[i] == max) {
				ch = '?'; // 배열에 저장된 값과 최대값이 같으면(제일 많이 나온 문자가 2개이상이면) '?' 저장
			}
		}

		System.out.println(ch);
	}
}
