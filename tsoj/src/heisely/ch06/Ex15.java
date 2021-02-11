package heisely.ch06;

// FactorialTest. 재귀호출(recursive call)
// 재귀호출이 주는 논리적 간결함 때문에 반복문보다 재귀호출을 사용하는 것이 구조적으로 단순하다.
public class Ex15 {
	public static void main(String[] args) {
		int result = factorial(4);

		System.out.println(result);
	}

	static int factorial(int n) {
		int result = 0;

		if (n == 1)
			result = 1;
		else
			result = n * factorial(n - 1); // 다시 메서드 자신을 호출
		return result;
	}
}
