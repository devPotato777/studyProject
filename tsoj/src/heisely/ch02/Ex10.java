package heisely.ch02;

// FloatEx1
public class Ex10 {
	public static void main(String[] args) {
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;

		System.out.printf("     123456789012345678901234\n");
		System.out.printf("f  : %f\n", f2); // 소수점이하 6째자리까지 출력
		System.out.printf("f  : %24.20f\n", f); // %24.20f: 24자리 표현+빈공간+소수점이하 20자리+빈자리0
		System.out.printf("f2 : %24.20f\n", f2);
		System.out.printf("d  : %24.20f\n", d);
	}
}
