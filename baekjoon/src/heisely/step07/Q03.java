package heisely.step07;

import java.util.Scanner;

// 문자열
// 10809. 알파벳 찾기
public class Q03 {
	public static void main(String[] args) {
		int[] arr = new int[26]; // a~z를 입력할 배열
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1; // 배열 arr의 모든 값들을 -1로 초기화
		}

		Scanner scan = new Scanner(System.in);
		String s = scan.next(); // 문자열을 받을 변수 s
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); // 문자열의 각 자리 알파벳들을 저장할 ch를 선언하고 저장

			if (arr[ch - 'a'] == -1) { // 같은 알파벳이 중복되어 나올 수도 있으므로 -1인 경우에만
				arr[ch - 'a'] = i; // i값을 ch-'a'인덱스 값에 넣어줌(b이면 2번째 자리에 i값)
			}
		}
		scan.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
