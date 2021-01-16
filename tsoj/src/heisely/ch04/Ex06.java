package heisely.ch04;

import java.util.Scanner;

// FlowEx6. switch문(1)
public class Ex06 {
	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요.> ");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장
		
		switch(month) {
			case 3: case 4: case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default: // 하단의 case 1, 2, 12를 쓰지 않아도 3~11 이외의 것들을 나타낼 때 사용(기본값)
//			case 12: case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
		}
	}
}
