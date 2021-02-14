package devPotato777.ch06;

// p.267 참조형 매개변수 (매개변수의 타입이 배열이므로)
public class Ex12 {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };

		printArr(arr); // 배열의 모든 요소를 출력
		sortArr(arr); // 배열을 정렬
		printArr(arr); // 정렬후 결과를 출력
		System.out.println("sum=" + sumArr(arr)); // 배열의 총합을 출력

	} // end of main

	static void printArr(int[] arr) { // 배열의 모든 요소를 출력
		System.out.print("[");

		for (int i : arr) { // 향상된 for문
			System.out.print(i + ", ");
		}
		System.out.println("]");

	}

	static int sumArr(int[] arr) { // 배열의 모든 요소의 합을 반환
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	static void sortArr(int[] arr) { // 배열을 오름차순으로 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				} // if
			} // for j
		} // for i
	} // sortArr(int[] arr)

}
