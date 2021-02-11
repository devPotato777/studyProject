package heisely.ch06;

// ReturnTest
public class Ex13 {
	public static void main(String[] args) {
		Ex13 r = new Ex13(); // JAVA의 정석에서는 class명이 ReturnTest여서 Ex13이 ReturnTest로 되어있음

		int result = r.add(3, 5);
		System.out.println(result);

		int[] result2 = { 0 }; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(3, 5, result2); // 배열을 add메서드의 매개변수로 전달
		System.out.println(result2[0]);

	}

	int add(int a, int b) {
		return a + b;
	}

	void add(int a, int b, int[] result) {
		result[0] = a + b; // 매개변수로 넘겨받은 배열에 연산결과 저장
	}
}
