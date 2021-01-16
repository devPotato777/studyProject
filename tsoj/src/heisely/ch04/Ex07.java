package heisely.ch04;

import java.util.Scanner;

// FloeEx7. switch문(2)
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요.(1~3)> ");
		
		int user = scan.nextInt(); // 화면을 통해 입력받은 숫자를 저장
		int com = (int)(Math.random()*3+1); // 1~3중 랜덤으로 하나가 com에 저장됨
/*
 		# Math.random()
 		0.0 <= Math.random()	 < 1.0
 		0.0 <= Math.random()*3	 < 3.0
 		1.0 <= Math.random()*3+1 < 4.0
 		
 		int형으로 형변환
 		1 	<= (int)(Math.random()*3+1) < 4
 */
		// 추가한 내용 1
		switch(user) {
			case 1:
				System.out.println("당신은 가위를 냈습니다.");
				break;
			case 2:
				System.out.println("당신은 바위를 냈습니다.");
				break;
			case 3:
				System.out.println("당신은 보를 냈습니다.");
				break;
		}
		// 추가한 내용 2
		switch(com) {
		case 1:
			System.out.println("com은 가위를 냈습니다.");
			break;
		case 2:
			System.out.println("com은 바위를 냈습니다.");
			break;
		case 3:
			System.out.println("com은 보를 냈습니다.");
			break;
		}
		// 본문 내용
		switch(user-com) {
			case -2: case 1:
				System.out.println("당신이 이겼습니다.");
				break;
			case -1: case 2:
				System.out.println("당신이 졌습니다.");
				break;
			case 0:
				System.out.println("비겼습니다.");
				break;
		}
	}
}
