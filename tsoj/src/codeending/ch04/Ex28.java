package codeending.ch04;

import java.util.Scanner;

/*
 * do-while문
 *  do{
 * 		//조건식의 연산결과가 참일 때 수행될 문장들을 적는다.
 *  } while (조건식) ; <- 끝에 ';'을 잊지 않도록 주의 
 *  
 *  기본적인 구조는 while문과 같으나 조건식과 블럭{}의 순서를 바꿈.
 *  그래서 while문과 반대로 블럭{}을 먼저 수행한 후에 조건식을 평가
 *  while문은 조건식에 결과에 따라 블럭{}이 한 번도 수행되지 않을 수 있음
 *  do-while은 최소한 한번은 수행 될 것을 보장.
 *  그리 많이 쓰이지는 않음.
 */
public class Ex28 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저장
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while (input != answer);
		
		System.out.println("정답입니다.");
	}

}
