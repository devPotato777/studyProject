package heisely.step03;

import java.util.Scanner;

// for문
// 10871. X보다 작은 수
public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i<n; i++) {
			if(arr[i]<x) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
