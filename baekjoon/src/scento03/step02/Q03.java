package scento03.step02;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("연도를 입력하세요.(1~4000)");

		int year = s.nextInt();

		if (year % 4 == 0) {
			if (year % 400 == 0)
				System.out.println("1");
			else if (year % 100 == 0)
				System.out.println("0");
			else
				System.out.println("1");
		} else
			System.out.println("0");
	}

}
