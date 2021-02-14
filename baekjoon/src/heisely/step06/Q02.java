package heisely.step06;

// 함수
// 4673. 셀프넘버
public class Q02 {
	public static int d(int number) {
		int sum = number; // 함수 d에 들어가는 number를 sum에 저장

		while (number > 0) {
			sum += number % 10; // number의 1의 자릿수를 계속 더해줌
			number /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = new int[10001]; // 1부터 10000 이하의 수를 뽑아낼 것이므로 크기가 10001인 배열 선언

		for (int i = 1; i < arr.length; i++) {
			int notSelfNum = d(i); // i를 1부터 반복해서 넣고 나온 함수값을 notSelfNum에 저장

			if (notSelfNum <= 10000) { // 그 함수값이 10000을 넘지 않으면
				arr[notSelfNum] = 1; // 그 배열 값을 1로 만들어줌
			}
		}
		
		// 그러면 함수값으로 나온 수들의 배열값은 전부 1이고, 나오지 않은 값은 초기화된 상태 그대로 0으로 저장돼 있음
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println(i); // 따라서 배열값이 1이 아닌 곳의 인덱스값을 뽑아주면 됨
			}
		}
	}
}
