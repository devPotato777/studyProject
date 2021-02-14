package codeending.ch05;

import java.util.*;

public class Ex23 {

	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자"}, //words[0][0], words[0][1]
				{"computer", "컴퓨터"}, //words[1][0] , words[1][1]
				{"integer", "정수"} //words[2][0], words[2][1]
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		}//end of for
	}// end of main

}
