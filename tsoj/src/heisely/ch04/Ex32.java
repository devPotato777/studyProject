package heisely.ch04;

import java.util.Scanner;

// FlowEx32. continue문(2)
public class Ex32 {
	public static void main(String[] args) {
		int menu = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)> ");

			menu = scan.nextInt();
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // while문을 벗어난다.
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("잘못 선택하셨습니다.");
				continue; // while문의 맨 첫줄로 돌아간다.
			}

			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
		}
	}
}
