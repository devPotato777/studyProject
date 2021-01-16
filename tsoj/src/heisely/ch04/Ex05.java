package heisely.ch04;

import java.util.*;

// FlowEx5. 중첩 if문
public class Ex05 {
	public static void main(String[] args) {
		int score=0;
		char grade = ' ', opt='0';
		
		System.out.print("점수를 입력해주세요.> ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		if(score>=90) { // 90점 이상이면 A인데
			grade='A';
			if(score>=98) { // 그 중에서 98이상이면 +,
				opt = '+';
			} else if(score<=94) { // 94이하이면 - 를 붙인다
				opt = '-';
			} // opt의 초기화값은 0.
		} else if(score>=80) {
			grade='B';
			if(score>=88) {
				opt = '+';
			} else if(score<=84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		
		System.out.println("당신의 학점은 "+grade+opt+"입니다.");
	}
}
