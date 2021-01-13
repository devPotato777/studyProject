package devPotato777.ch04;

import java.util.*;

/*
 * switch문의 중첩
 * if문처럼 switch문도 중첩이 가능하다.
 * 한 가지 주의할 점은 중첩 switch문에서 break문을 빼먹기 쉽다는 것이다.
 */

public class Ex11 {

	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) > ");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7);	// 입력받은 번호의 8번째 문자를 gender에 저장
		
		switch (gender) {
		case '1': case '3':
			switch (gender) {
			case '1':
				System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
				break;
			case '3':
				System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
				break;
			}
			break; // 이 break문을 빼먹지 않도록 주의
		case '2': case '4':
			switch (gender) {
			case '2':
				System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
				break;
			case '4':
				System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
				break;
			}
			break; // 이 break문을 빼먹지 않도록 주의
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}

	}	// main의 끝

}
