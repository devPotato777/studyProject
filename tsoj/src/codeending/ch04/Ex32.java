package codeending.ch04;

import java.util.Scanner;

/*
 * break문과 continue문의 차이
 * 
 */
public class Ex32 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종류:0)>");
			
			String tmp = sc.nextLine(); //화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp); //
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break; //반복문을 벗어난다.
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셧습니다.(종료는 0)");
				continue; //조건식으로 돌아간다.
			}
			
			System.out.println("선택하신 메뉴는 "+ menu + "번입니다.");
			
		}
	} //main의 끝

}
