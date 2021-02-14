package heisely.step05;

import java.util.Scanner;

// 1차원 배열
// 1546. 평균
public class Q05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int subj = scan.nextInt();
		int[] score = new int[subj];
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}
		scan.close();

		double tot = 0;
		int max = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i]; // 최대값 저장
			}
		}
		for (int i = 0; i < score.length; i++) {
			tot += (score[i] * 100 / (double)max); // 모든값에 대해 *100/max 적용해서 합산
		}
		double avg = tot / score.length; // 평균구하기
		System.out.println(avg); // 평균 출력
	}
}
