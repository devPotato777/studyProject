package heisely.step12;

import java.util.Arrays;
import java.util.Scanner;

// 2108. 통계학
public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 입력할 숫자의 개수
		int[] arr = new int[n]; // 입력한 수들의 배열
		int total = 0; // 산술평균을 위한 합 변수

		// 수의 범위 -4000 ~ 4000으로 총 8001개. 그런데 배열 index가 음수일 수는 없음
		// 최빈값 배열 생성
		int[] nums = new int[8001]; // 모든 인덱스의 배열값은 0으로 초기화 됨
		
		// arr[i]값 정의, 산술평균을 위한 total 변수값, 최빈값을 위한 값
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			total += arr[i];
			// 입력하는 숫자를 인덱스로(물론 +4000) 해당 인덱스마다 카운트를 늘려줘야 함.
			nums[arr[i] + 4000]++; // ex) arr[i]=-3999 이면 num[1]=0에서 1이 됨
		}
		
		// 최빈값을 찾기 위한 변수 min 선언 및 초기화
		int min = 0; // nums배열값의 최솟값은 초기화값인 0이므로 최솟값을 0으로 두고
		for (int i = 0; i < nums.length; i++) {
			if (min < nums[i]) {
				min = nums[i]; // 0보다 큰 값을 min에 저장. 위 for문을 거꾸로 간다고 생각하면 됨.
			}
		}

		// 최빈값이 2개 이상일 경우를 대비한 배열 선언 및 초기화.
		// (예를 들어 max nums[i] = 3이라고 할 때 3인 경우가 많을 경우!)
		int[] nums2 = new int[2];
		int cnt = 0; // nums2배열의 index역할
		for (int i = 0; i < nums.length; i++) {
			if (nums2[0] != 0 && nums2[1] != 0) // 첫 번째 값(i)과 두 번째 값(i)이 0이 아니면 끝남
				break;
			if (min == nums[i]) { // 배열값이 min(3)인 i들을 찾는데, 0부터 시작하므로
				nums2[cnt] = i; // nums2[cnt]의 배열값들은 작은 순으로 알아서 정렬됨
				cnt++;
			}
		}
		// 최빈값이 하나일 경우(두 번째로 작은 최빈값이 0일 경우)
		if(nums2[1]==0) 
			nums2[1] = nums2[0];
		
		// arr 정렬
		Arrays.sort(arr); 

		System.out.println((int) (Math.round((double) total / n))); // 산술 평균
		System.out.println(arr[n / 2]); // 중앙값
		System.out.println(nums2[1] - 4000); // 최빈값, 2번째로 작은 최빈값이라고 했으니 0번째가 아닌 1번째 배열값이고, -4000을 해줘야함.
		System.out.println(arr[n - 1] - arr[0]); // 범위
	}
}
