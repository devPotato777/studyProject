package heisely.ch05;

// 1. 배열(Array)
// ArrayEx7. 배열의 활용(3) - 섞기(Shuffle)(1)
public class Ex07 {
	public static void main(String[] args) {
		int[] numArr = new int[10]; // 길이가 10인 배열 선언

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // 0~9를 차례로 입력
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); // 0~9의 수 중 하나를 임의로 얻음

			// numArr[0]과 numArr[n]의 값을 서로 바꾸기 - 100번 반복
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}
}
