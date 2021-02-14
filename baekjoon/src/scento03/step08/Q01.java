package scento03.step08;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); // 고정비용
		int b = scan.nextInt(); // 가변비용
		int c = scan.nextInt(); // 판매비용

//		      x를 판매개수라고 하면, cx > a+bx 일 때 이익발생
//		      즉, (c-b)x > a ==> x > a/(c-b) 일 때 이익 발생
//		      이익이 존재하려면 c-b>0이어야 하고(c>b), a,b,c 모두 int이므로 손익분기점인 x는 a/(c-b)보다 하나 더 크면 됨
		if (c > b)
			System.out.println((a / (c - b)) + 1);
		else {
			System.out.println("-1");
		}

	}
}
