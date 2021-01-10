package heisely.ch03;

// OperatorEx9
public class Ex09 {
	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;

		System.out.println("a = " + a); // a의 타입은 long이지만, 리터럴들이 int이므로 오버플로우 발생
		System.out.println("b = " + b); // b는 int * long이므로 long값으로 반환, 오버플로우 미발생
	}
}
