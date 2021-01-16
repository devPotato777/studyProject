package heisely.step02;

import java.util.Scanner;

// if문
// 2884. 알람 시계
public class Q05 {
	public static void main(String[] args) {
		System.out.print("일어나야 할 시간을 입력해주세요.(띄어쓰기로 시/분 구분)> ");
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minutes = scan.nextInt();

		if (minutes < 45) {
			if (hour == 0) {
				hour = hour + 23;
			} else {
				hour = hour - 1;
			}
			minutes = minutes + 15;
		} else {
			minutes = minutes - 45;
		}
		System.out.println("알람설정시간: " + hour + "시 " + minutes + "분");
	}
}
