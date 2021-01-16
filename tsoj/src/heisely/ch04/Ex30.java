package heisely.ch04;

// FlowEx30. break문
public class Ex30 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while (true) {
			if (sum > 100)
				break; // break문이 수행되면 하단내용은 실행되지 않고 while문을 완전히 벗어난다.
			++i;
			sum += i;
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}
}
