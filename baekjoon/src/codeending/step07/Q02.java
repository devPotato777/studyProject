package codeending.step07;

import java.util.Scanner;

/*
 * 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 
 * 예제 입력 : 1
			1
 * 
 * 예제 출력 : 1
 * 
 * 예제 입력 : 5
			54321
 * 
 * 예제 출력 : 15
 */
public class Q02 {

	public static void main(String[] args) {
		N11720();
	}
	public static void N11720( ) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] arr = new String[num];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}
}
