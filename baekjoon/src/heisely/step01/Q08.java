package heisely.step01;

// 1008. A/B
import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2개의 정수를 입력하세요.(띄어쓰기 혹은 엔터로 구분해 입력하세요.)> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("입력한 두 정수: " + a + ", " + b);
		System.out.println("나눈 두 정수의 몫: " + (a / b));
	}
}
