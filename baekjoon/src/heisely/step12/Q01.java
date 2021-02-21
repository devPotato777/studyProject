package heisely.step12;

import java.util.Scanner;

// 2750. 수 정렬하기
public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 시도횟수 입력
		int[] arr = new int[n]; // 시도횟수의 크기만큼 배열 생성
		for (int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		for (int i=0; i<arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
