package heisely.step07;

import java.util.Scanner;

// 문자열
// 2675. 문자열반복
public class Q04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt(); // 테스트할 횟수 입력받아 저장

		for (int i = 0; i < test; i++) {
			int cnt = scan.nextInt(); // 반복할 횟수 입력받아 저장
			String s = scan.next(); // 반복할 문장
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < cnt; k++) {
					System.out.print(s.charAt(j)); // 입력받은 문장을 쪼개서 각 알파벳들을 cnt번 반복해 출력
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
