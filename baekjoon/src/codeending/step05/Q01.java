package codeending.step05;

import java.util.Scanner;

/*
 * 최소 , 최대
 * 
 * 문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
 * 		모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 
 * 출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * 
 * 예제 입력 : 5
 *           20 10 35 30 7
 * 
 * 예제 출력 : 7 35
 */
public class Q01 {

	public static void main(String[] args) {
		N10818();
	}
	public static void N10818() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int tmp = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println(arr[0]+" "+arr[N-1]);
		
		sc.close();
	}

}
