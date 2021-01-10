package baekjoon.heisely.step01;

// 2588. 곱셈(세 자리 수 X 세 자리 수)
import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("세 자리 수를 2개 입력하세요.(띄어쓰기 혹은 엔터로 구분).> ");
		int a= scan.nextInt();
		int b = scan.nextInt();
		System.out.println("입력하신 두 수의 곱 >>");
		System.out.println("\t"+a);
		System.out.println("X\t"+b);
		System.out.println("---------------");
		System.out.println("       "+a*(b%10));
		System.out.println("      "+a*((b%100)/10));
		System.out.println("     "+a*(b/100));
		System.out.println("---------------");
		System.out.println("     "+a*b);
	}
}
