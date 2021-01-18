package devPotato777.ch04;

import java.util.*;

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
