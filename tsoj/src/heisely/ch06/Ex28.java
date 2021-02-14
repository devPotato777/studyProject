package heisely.ch06;

// StaticBlockTest.
public class Ex28 {
	static int[] arr = new int[10]; // 명시적 초기화를 통해 크기가 10인 배열 생성

	static {
		// 클래스 초기화 블럭을 이용해 배열의 각 요소값 저장
		for (int i = 0; i < arr.length; i++) {
			// 1과 10 사이의 임의의 값을 배열 arr에 저장
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
	}
}
