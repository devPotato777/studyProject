package scento03.ch04;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input!=0)
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 "+ input +"입니다.");
	}

}
