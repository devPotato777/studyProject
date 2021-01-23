package heisely.ch05;

import java.util.Arrays;

// 1. 배열(Array)
// ArrayEx9. 배열의 활용(5) - 임의의 값으로 배열 채우기
public class Ex09 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 }; // 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * code.length); // 0 ~ code.length-1
			arr[i] = code[tmp];
		}

		System.out.println(Arrays.toString(arr));
	}
}
