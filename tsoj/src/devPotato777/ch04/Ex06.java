package devPotato777.ch04;

import java.util.*;

/*
 * switch문
 * 1) 조건식을 계산한다.
 * 2) 조건식의 결과와 일치하는 case문으로 이동한다.
 * 3) 이후의 문장들을 수행한다.
 * 4) break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.
 * 
 * swtich문의 제약조건
 * 1) switch문의 조건식 결과는 정수 또는 문자열이어야 한다.
 * 2) case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.
 * 
 * 만일 조건식의 결과와 일치하는 case문이 하나도 없을 경우에는 default문으로 이동한다.
 * default문의 위치는 어디라도 상관없으나 보통 마지막에 놓기 때문에 break문을 쓰지 않아도 된다.
 * if문의 else블럭과 같은 역할을 한다고 보면 이해가 쉬울 것이다.
 * 
 * switch문에서 break문은 각 case문의 영역을 구분하는 역할을 한다.
 * break문을 생략하면 case문 사이의 구분이 없어지므로 다른 break문을 만나거나
 * switch문 블럭{}의 끝을 만날 때까지 나오는 모든 문장을 수행한다.
 * 그러므로 각 case문의 마지막에 break문을 빼먹는 실수를 하지 않도록 주의해야한다.
 * 
 * 고의적으로 break문을 생략하는 경우도 있는데,
 * 회원 등급에 맞는 권한을 부여하는 방식인 경우이다.
 * 
 * 
 * switch (조건식) {
 * 		case 값 :
 * 			// 조건식의 결과가 값1과 같을 경우 수행될 문장들
 * 			// ...
 * 			break;
 * 		case 값2 :
 * 			// 조건식의 결과가 값2와 같을 경우 수행될 문장들
 * 			// ...
 * 			break;		// switch문을 벗어난다.
 * 		// ...
 * 		default :
 * 			// 조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
 * 			// ...
 * }
 */

public class Ex06 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요. > ");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();	// 화면을 통해 입력받은 숫자를 month에 저장
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default:
//		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		}
		
		System.out.println("예제 코드 종료\n");
		
		// 책의 예제는 1 ~ 12가 아닌 숫자를 적을 때도 
		// default문으로 넘어가서 현재의 계절은 겨울이라고 한다.
		// 그래서 밑의 코드로 다시 작성해보았다.
		
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		default:
			System.out.println("1 ~ 12 중에 입력하세요.");
			break;
		}

	}	// main의 끝

}
