package devPotato777.ch05;

public class Ex01 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int k = 1;

		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70; // score[2] = 70;
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k + 2] + score[4]; // int tmp = score[3] + score[4]

		// for문으로 배열의 모든 요소를 출력한다.
		for (int i = 0; i < 5; i++) {
			System.out.printf("score[%d] : %d%n", i, score[i]);
		}

		System.out.printf("tmp : %d%n", tmp);

		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7
		 * out of bounds for length 5 at devPotato777.ch05.Ex01.main(Ex01.java:73) =>
		 * 배열의 범위를 넘었다는 뜻
		 */
		System.out.printf("score[%d] : %d%n", 7, score[7]); // index의 범위를 벗어난 값

	} // main의 끝

}
