package heisely.ch05;

// 1. 배열(Array)
// ArrayEx11. 배열의 활용 - 빈도수 구하기
public class Ex11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10); // 0~9 중 임의의 수 저장
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++; // numArr[i]에 저장된 숫자를 index로 해서 해당 인덱스의 값을 1씩 증가시킴
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수: " + counter[i]);
		}
	}
}
