package scento03.step02;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요.(0~100)>");
		Scanner s = new Scanner(System.in);
		String tmp = s.nextLine();
		score = Integer.parseInt(tmp);
		
		if (score >= 90) {
					grade = 'A';
		} else if (score >= 80) {
					grade = 'B';
		} else if (score >= 70) {
					grade = 'C';
		} else if (score >= 60) {
					grade = 'D';
		} else {
					grade = 'F';
		}
		
		System.out.println("grade");
	}

}
