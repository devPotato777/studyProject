package heisely.step05;

import java.util.Scanner;

// 1차원 배열
// 4344. 평균은 넘겠지	
public class Q07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 테스트 수
		
		for (int i = 0; i < n; i++) {
			int num = scan.nextInt(); // 학생 수
			int[] arr = new int[num]; // 점수를 입력할 배열 선언
			double tot = 0.0; // 총점저장할 변수

			// 성적 입력
			for (int j = 0; j < num; j++) {
				arr[j] = scan.nextInt(); // 입력받는 숫자를 순서대로 arr에 저장
				tot += arr[j]; // 입력받은 수들을 더함
			}
			double avg = tot / num; // 평균저장할 변수. 과목 평균 = 총점/학생 수
			
			int cnt = 0; // 평균 넘는 학생 수를 구하기 위한 변수 선언
			// 평균 넘는 학생 수 구하기			
			for (int j = 0; j < num; j++) {
				if (arr[j] > avg) {
					cnt++; // 배열에 저장된 점수인 arr[j]이 평균보다 크다면 cnt 증가
				}
			}
			System.out.printf("%.3f\n", (cnt * 100 / (double) num)); // 평균이 넘는 학생의 비율
		}
	}
}
