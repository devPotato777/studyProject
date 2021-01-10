package heisely.ch03;

// OperatorEx10
public class Ex10 {
	public static void main(String[] args) {
		int a = 1_000_000;

		int result1 = a * a / a; // 1000000 * 1000000 / 1000000
		int result2 = a / a * a; // 1000000 / 1000000 * 1000000

		System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
		// 위의 경우, 1000000*1000000 이 int 범위를 넘어서버려서 오버플로우가 발생
		System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);
		// 위의 경우, 나누기를 먼저해서 1 * 1000000이 돼서 오버플로우 미발생
	}
}
