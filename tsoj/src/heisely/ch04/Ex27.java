package heisely.ch04;

import java.util.Scanner;

// FlowEx27. while문(5)
public class Ex27 {
	public static void main(String[] args) {
		System.out.println("합계를 구할 숫자를 입력하세요.(종료:0)");
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		boolean flag = true;

		while (flag) { // flag의 값이 true이므로 조건식은 참이 됨
			System.out.print(">> ");
			int num = scan.nextInt();

			if (num != 0) { // num이 0이 아니면 sum에 num을 더함
				sum += num;
			} else {
				flag = false; // num=0이면 조건식을 false로 만들어서 while문을 벗어남
			}
		}
		System.out.println("합계: " + sum);
	}
}
