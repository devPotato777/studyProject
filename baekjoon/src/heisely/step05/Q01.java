package heisely.step05;

import java.util.Scanner;

// 1차원 배열
// 10818. 최소,최대
public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n]; // 화면을 통해 입력받은 수를 배열의 크기로 지정
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt(); // 화면을 통해 각 인덱스마다 값을 입력받음
//			System.out.print(arr[i]+" "); // 배열 확인하기 위한 출력 코드
		}
		scan.close();
		// tsoj/ch05/Ex6 활용
		int max = arr[0]; // 최대값을 arr[0]으로 초기화
		int min = arr[0]; // 최소값을 arr[0]으로 초기화
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) { 
				max = arr[i]; // max보다 큰 값이 있으면 max에 저장
			} else if (arr[i] < min) {
				min = arr[i]; // min보다 작은 값이 있으면 min에 저장
			}
		}
		System.out.print(min + " " + max); // 최소값과 최대값 출력
	}
}
