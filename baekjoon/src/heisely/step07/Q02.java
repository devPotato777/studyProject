package heisely.step07;

import java.util.Scanner;

// 문자열
// 11720. 숫자의 합
public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt(); // 숫자의 개수를 입력받을 변수
		int sum = 0; // 합계를 위한 변수 선언 및 초기화
		String num = scan.next(); // 띄어쓰기 없이 문자열로 숫자를 받음
		
		for(int i=0; i<cnt; i++) {
			sum += (num.charAt(i)-48); // 문자열로 받은 것들을 하나하나 쪼개서 48을 빼준 뒤 전부 더해줌
		}
		System.out.println(sum);
		scan.close();
	}
}
