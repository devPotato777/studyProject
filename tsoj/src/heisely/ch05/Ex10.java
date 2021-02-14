package heisely.ch05;

// 1. 배열(Array)
// ArrayEx10. 배열의 활용 - 정렬하기(sort)
public class Ex10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		System.out.print("정렬 전: ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false;

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
					int tmp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = tmp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로
				}
			}

			if (!changed) break;
				// 초기 값이 false이므로 true가 되면 반복문을 벗어남
				// 자리바꿈이 발생하면 false -> true -> false이므로 반복문을 벗어나지 않음
				// 자리바꿈이 더 이상 발생하지 않으면 false -> true 이므로 반복문을 벗어남
			
			System.out.print((i+1) + "번째 정렬 후: ");
			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	}
}
