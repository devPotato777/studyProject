package heisely.ch04;

import java.util.Scanner;

// FlowEx8. switch문(3)
public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 주민번호를 입력하세요.(011231-11112222)> ");
		String regNo = scan.nextLine();
		
		char gender = regNo.charAt(7); // regNo의 8번째 문자를 gender에 저장
		// index는 0부터 시작하므로 charAt(7)은 8번째 문자이다.
		
		switch(gender) {
			case '1': case '3': // gender의 타입이 char이므로 ''안에 입력
				System.out.println("당신의 성별은 남자입니다.");
				break;
			case '2': case '4':
				System.out.println("당신의 성별은 여자입니다.");
				break;
			default:
				System.out.println("유효하지 않은 주민번호 입니다.");
		}
	}
}
