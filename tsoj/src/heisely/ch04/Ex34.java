package heisely.ch04;

import java.util.Scanner;

// FlowEx34. 이름 붙은 반복문(2) - FlowEx32 확장
public class Ex34 {
	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scan = new Scanner(System.in);

		outer: while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)> ");

			menu = scan.nextInt();
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // while문을 벗어난다.
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료:0)");
				continue; // while문의 맨 첫줄로 돌아간다.
			}

			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");

			for (;;) {
				System.out.print("계산할 값을 입력하세요.(계산 종료: 0, 전체 종료: 99)> ");
				num = scan.nextInt();

				if (num == 0) {
					System.out.println("계산을 종료하고 처음으로 돌아갑니다.");
					break; // 계산 종료. for문을 벗어남
				}
				if (num == 99) {
					System.out.println("프로그램을 종료합니다.");
					break outer; // 전체 종료. for문과 while문 전체를 벗어남
				}
				switch (menu) {
					case 1:
						System.out.println("result = " + num * num);
						break;
					case 2:
						System.out.println("result = " + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result = " + Math.log(num));
						break;
				}

			}
		}
	}
}
