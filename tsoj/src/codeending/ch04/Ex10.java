package codeending.ch04;

import java.util.Scanner;
/*
 * score를 10으로 나누면, 89~80 -> 8
 * 이처럼 switch문에서는 조건식을 잘 만들어서 case문의 갯수를 줄이는 것이 중요하다.
 */
public class Ex10 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.println("당신의 점수를 입력하세요.(1~100)>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp); //입력받은 문자열(tmp)를 숫자로 변환
		
		switch(score/10) {
			case 10:
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			default :
				grade = 'F';
		} // end of switch
		
		System.out.println("당신의 학점은 "+ grade + "입니다.");
	} //main의 끝

}
