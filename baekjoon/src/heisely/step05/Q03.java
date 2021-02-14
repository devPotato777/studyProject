package heisely.step05;

import java.util.Scanner;

// 1차원 배열
// 2577. 숫자의 개수
public class Q03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = a * b * c;
		scan.close();
		
		int[] cnt = new int[10]; // 0~9는 10개이므로..
		do {
			cnt[d % 10]++; // 곱한 수의 1의자리수의 인덱스의 값을 1씩 증가시킴(배열은 초기화안하면 0으로 들어감)
			d /= 10; // 기존의 십의자리를 새로운 1의자리로 만들기 위함
		} while (d != 0);
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}
