package heisely.step01;

import java.util.Scanner;

// 10430. 나머지
public class Q10 {
	public static void main(String[] args) {
		System.out.println("(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?");
		System.out.println("(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?");
		System.out.println("확인해봅시다.");
		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 세 개 입력하세요.(띄어쓰기 혹은 엔터로 구분).> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println("(" + a + "+" + b + ")%" + c + " = " + (a + b) % c);
		System.out.println("((" + a + "%" + c + ")+(" + b + "%" + c + "))%" + c + " = " + ((a % c) + (b % c)) % c);
		System.out.print("(" + a + "+" + b + ")%" + c + " = ((" + a + "%" + c + ")+(" + b + "%" + c + "))%" + c + " ?? ");
		System.out.printf("%b\n", (a + b) % c == ((a % c) + (b % c)) % c);
	}
}
