package codeending.step03;

import java.util.Scanner;

/* for문 구구단
 * 
 * 문제 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 * 
 * 입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 
 * 출력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 
 * 
 */
public class Q01 {

	public static void main(String[] args) {
		N2739();
	}
	public static void N2739() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<10; i++)
			System.out.println(num+" * "+i+" = "+i*num);
	}

}
