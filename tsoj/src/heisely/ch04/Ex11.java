package heisely.ch04;

import java.util.Scanner;

// FlowEx11. switch문의 중첩 >> FlowEx8(Ch04/Ex08) 활용
public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 주민번호를 입력하세요.(011231-11112222)> ");
		String regNo = scan.nextLine();
		
		char gender = regNo.charAt(7); // regNo의 8번째 문자를 gender에 저장
		// index는 0부터 시작하므로 charAt(7)은 8번째 문자이다.
		
		switch(gender) {
			case '1': case '3': // gender의 타입이 char이므로 ''안에 입력
				switch(gender) {
					case '1':
						System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
						break;
					case '3':
						System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
				}
				break; // 이 break문을 빼먹지 않도록 주의!
			case '2': case '4':
				switch(gender) {
					case '2':
						System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
						break;
					case '4':
						System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
				}
				break;
			default:
				System.out.println("유효하지 않은 주민번호 입니다.");
		}
	}
}
