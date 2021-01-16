package heisely.ch04;

import java.util.Scanner;

// FlowEx25. while문(3)
public class Ex25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.(예:12345)> ");
		int num = scan.nextInt();
		int sum = 0;
		System.out.println("입력한 숫자: " + num);
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
			System.out.printf("sum = %3d, num = %d\n", sum, num);
		}
		System.out.println("각 자리 수의 합: " + sum);
	}
}
