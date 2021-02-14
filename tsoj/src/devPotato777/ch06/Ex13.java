package devPotato777.ch06;

// p.267 ReturnTest 참조형 매개변수 (매개변수의 타입이 배열이므로)
public class Ex13 {

	public static void main(String[] args) {
		Ex13 ex13 = new Ex13();

		int result = ex13.add(3, 5);
		System.out.println(result);

		int[] result2 = { 0 }; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
		ex13.add(3, 5, result2); // 배열을 add메서드의 매개변수로 전달
		System.out.println(result2[0]);

	}

	int add(int a, int b) {
		return a + b;
	}

	void add(int a, int b, int[] result) {
		result[0] = a + b; // 매개변수로 넘겨받은 배열에 연산결과를 저장
	}

}
