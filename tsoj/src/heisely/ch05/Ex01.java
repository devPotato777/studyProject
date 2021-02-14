package heisely.ch05;

// 1. 배열(Array)
// ArrayEx1.
public class Ex01 {
	public static void main(String[] args) {
		int[] score = new int[5]; // size=5인 배열 score 선언
		int k = 1;

		// 배열의 각 index에 값 설정
		score[0] = 50;
		score[1] = 0;
		score[k + 1] = 70; // k=1이므로 score[k+1] = score[2]
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k + 2] + score[4]; // tmp = score[3]+score[4]

		// for문으로 배열의 모든 요소 출력
		for (int i = 0; i < 5; i++) { // index는 0부터 시작하므로, 0~4 입력
			System.out.printf("score[%d]: %d\n", i, score[i]);
		}

		System.out.printf("tmp: %d\n", tmp);
		System.out.printf("score[%d]: %d\n", 7, score[7]); // index의 범위를 벗어난 값 ==> ArrayIndexOutOfBoundsException 발생

	}
}
