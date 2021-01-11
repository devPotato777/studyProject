package devPotato777.ch04;

import java.util.*;	// Scanner클래스를 사용하기 위해 추가

public class Ex02 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요. > ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	// 화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);		// 입력받은 문자열(tmp)을 숫자로 변환
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		//	if문에 괄호가 없을 경우 첫 번째 문장만 if문에 속하게 된다.
		//	printf문은 if문에 속하지 않기 때문에 입력값이 어떻든 항상 출력된다.
		if(input!=0) 
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		
	}	// main의 끝

}
