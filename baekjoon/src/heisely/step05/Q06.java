package heisely.step05;

import java.util.Scanner;

// 1차원 배열
// 8958. OX퀴즈
public class Q06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] ox = new String[n]; // 배열 ox의 방의 크기 설정
		
		for (int i = 0; i < ox.length; i++) {
			ox[i] = scan.next(); // 배열 ox의 방의 개수만큼 문자열을 입력받음
		}
		scan.close();
		
		for (int i = 0; i < ox.length; i++) {
			int cnt = 0; // 1씩 증가할 변수 초기화
			int score = 0; // 총 합산을 구할 변수 초기화
			
			for (int j = 0; j < ox[i].length(); j++) {
				if (ox[i].charAt(j) == 'O') {
					cnt++; // ox의 i번째 방의 j번째 문자가 O이면 cnt 증가 
				} else {
					cnt = 0; // O가 아니면 cnt=0으로 변경
				}
				score += cnt; // 각각의 경우 cnt 합산
			}
			System.out.println(score); // 합산값 출력
		}
	}
}
