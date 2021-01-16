package heisely.step03;

import java.util.Scanner;

//for문
//11022. A+B(8) - 11021. A+B(7) 확장
public class Q08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시도할 횟수를 입력하세요.> ");
		int cnt = scan.nextInt();

		for (int i = 1; i <= cnt; i++) {
			System.out.print("더할 두 수를 입력하세요.(1~9/띄어쓰기로 구분)> ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
		}
		System.out.println("모든 시도를 마쳤습니다. 프로그램을 종료합니다.");
	}
}
