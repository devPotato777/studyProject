package heisely.ch03;

// OperatorEx8
public class Ex08 {
	public static void main(String[] args) {
		int a = 1_000_000; // 1,000,000 1백만
		int b = 2_000_000; // 2,000,000 2백만
		long c = a * b; // a * b = 2,000,000,000,000?

		System.out.println(c);
		// c는 long타입이고, 2,000,000,000,000값이 들어가기에 충분한 크기라 그대로 결과값이 나올 거 같지만,
		// int와 int의 계산결과는 int이므로 결과적으로는 오버플로우가 발생한다.
		c = (long) a * b; // 명시적 형변환을 해줘야 2,000,000,000,000이 제대로 반환된다.
		System.out.println(c);
	}
}
