package devPotato777.ch04;

import java.util.*;

/*
 * 문자열에 저장된 문자는 '문자열.charAt(index)'로 가져올 수 있는데,
 * index는 연속된 정수값으로 1이 아닌 0부터 시작한다.
 * 
 * char타입의 값은 사실 문자가 아닌 정수(유니코드)로 저장되기 때문에
 * 이처럼 char타입의 값도 switch문의 조건식과 case문에 사용할 수 있다.
 */

public class Ex08 {

	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하세요.\nex. 011231-1111222 > \n");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();

		char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장

		switch (gender) {
		case '1': case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2': case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}

	} // main의 끝

}
