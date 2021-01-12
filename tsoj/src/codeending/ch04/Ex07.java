package codeending.ch04;

import java.util.Scanner;
/*
 * Math.radom() 이 메서드는 0.0과 1.0 사이의 double값을 반환
 * 0.0 <= Math.radom() < 1.0
 * 1. 각 변에 3을 곱한다. 0.0 <=  Math.radom()*3 < 3.0
 * 2.각 변을 int형으로 변환한다. 0 <= (int)Math.radom()*3 < 3
 * 3.각 변에 1을 더한다. 1 <= (int)Math.radom()*3 +1 < 4 ㅡ> 그럼 1~3까지의 랜덤수가 나온다.
 */
public class Ex07 {

	public static void main(String[] args) {
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt(); //화면을 통해 입력받은 숫자를 user에 저장
		int com = (int)(Math.random() * 3) +1; // 1,2,3중 하나가 com에 저장됨
		
		System.out.println("당시은 "+ user + "입니다.");
		System.out.println("컴은 "+ com + "입니다.");
		
		switch(user-com) {
			case 2: case -1:
				System.out.println("당신이 졌습니다.");
				break;
			case 1: case -2:
				System.out.println("당신이 이겼습니다.");
				break;
			case 0:
				System.out.println("비겼습니다.");
//				break; //마지막 문장이므로 break를 사용할 필요가 없다.
		} //main의 끝
	}

}
