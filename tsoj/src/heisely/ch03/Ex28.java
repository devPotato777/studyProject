package heisely.ch03;

// OperatorEx28: 비트연산자 &(AND) |(OR) ^(XOR)
public class Ex28 {
	public static void main(String[] args) {
		int x = 0xAB, y = 0xF;

		System.out.printf("x = %#X\t\t%s\n", x, toBinaryString(x));
		System.out.printf("y = %#X	\t\t%s\n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X\t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X\t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X\t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X	%s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));
	}

	static String toBinaryString(int x) { 
		// 비트연산의 결과를 2진수로 출력하기 위한 메서드: 4 byte의 정수를 32자리의 2진수로 변환
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}
}
