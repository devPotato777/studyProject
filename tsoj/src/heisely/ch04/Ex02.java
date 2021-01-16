package heisely.ch04;

import java.util.*;

//FlowEx2. 블럭{}
public class Ex02 {
	public static void main(String[] args) {
		int input;

		System.out.print("숫자를 하나 입력하세요.> ");

		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환

		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}

		if (input != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 " + input + "입니다.");
		}
	}
}
