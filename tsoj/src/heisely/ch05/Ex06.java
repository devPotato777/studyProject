package heisely.ch05;

// 1. 배열(Array)
// ArrayEx6. 배열의 활용 - 최대값과 최소값
public class Ex06 {
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫 번째 값으로 초기화
		int min = score[0]; // 배열의 첫 번째 값으로 초기화

		for (int i = 1; i < score.length; i++) {
			// 배열의 두 번째 요소부터 읽기 위해 변수 i의 값을 1로 초기화
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}

		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
