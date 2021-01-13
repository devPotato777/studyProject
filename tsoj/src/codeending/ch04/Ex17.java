package codeending.ch04;

import java.util.Scanner;
/*
 * 중첩 for문
 */
public class Ex17 {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.println("*을 출력할 라인의 수를 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); //화면을 통해 입력받으 내용을 tmp에 저장
		num = Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 변환
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}//main의 끝

}
