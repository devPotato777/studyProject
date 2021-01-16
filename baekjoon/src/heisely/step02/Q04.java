package heisely.step02;

import java.util.Scanner;

// if문
// 14681. 사분면 고르기
public class Q04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x와 y의 좌표를 입력하세요.(예: 2 5)(단, x와 y는 0이 아닙니다.)> ");
		int x = scan.nextInt();
		int y = scan.nextInt();

		// 일반 if문으로 작성
		if (x > 0 && y > 0) {
			System.out.println("1사분면의 좌표입니다.");
		} else if (x < 0 && y > 0) {
			System.out.println("2사분면의 좌표입니다.");
		} else if (x < 0 && y < 0) {
			System.out.println("3사분면의 좌표입니다.");
		} else if (x > 0 && y < 0) {
			System.out.println("4사분면의 좌표입니다.");
		}

		// 중첩 if문으로 작성
		if (x > 0) {
			if (y > 0) {
				System.out.println("1사분면의 좌표입니다.");
			} else {
				System.out.println("4사분면의 좌표입니다.");
			}
		} else {
			if (y > 0) {
				System.out.println("2사분면의 좌표입니다.");
			} else {
				System.out.println("3사분면의 좌표입니다.");
			}
		}
	}
}
