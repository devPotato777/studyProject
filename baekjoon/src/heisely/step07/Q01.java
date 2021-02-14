package heisely.step07;

import java.util.Scanner;

// 문자열
// 11654. 아스키코드
public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ascii = scan.next().charAt(0); // 스트링으로 받은걸 쪼개서 저장
		System.out.println(ascii);
	}
}
