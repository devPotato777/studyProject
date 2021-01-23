package devPotato777.step05;

import java.util.Scanner;

/*
4344번
평균은 넘겠지

문제
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 
학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
이어서 N명의 점수가 주어진다. 
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력 
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 
소수점 셋째 자리까지 출력한다.
*/

public class Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr;

		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {
			int student = sc.nextInt(); // 학생 수
			arr = new int[student];

			double sum = 0; // 성적 누적 합

			// 성적 입력
			for (int j = 0; j < student; j++) {
				int score = sc.nextInt(); // 성적 입력
				arr[j] = score;
				sum += score;
			} // for j

			double avg = (sum / student); // 평균
			double cnt = 0; // 평균 넘는 학생 수 변수

			// 평균 넘는 학생 비율 찾기
			for (int k = 0; k < student; k++) {
				if (arr[k] > avg) {
					cnt++;
				}
			} // for k
			
			// printf문에서 %를 표시하기 위해선 %%
			System.out.printf("%.3f%%\n", (cnt / student) * 100);
			
		} // for i

		sc.close();
		
	} // main의 끝

}
