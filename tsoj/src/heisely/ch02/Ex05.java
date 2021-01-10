package heisely.ch02;

// PrintfEx2
public class Ex05 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";

		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1=%f, %e, %g\n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g\n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g\n", f3, f3, f3);

		System.out.printf("d=%f\n", d); // d는 double인데 표현식은 float이므로 float가 표현할 수 있는 자릿수까지만 표현
		System.out.printf("d=%14.10f\n", d); // 전체 14자리 중 소수점 10자리

		System.out.printf("[12345678901234567890]\n"); // 20자리 표현을 위한 수
		System.out.printf("[%s]\n", url); // %s: 문자열 출력
		System.out.printf("[%20s]\n", url); // %20s: 20자리 중 앞에 남는 공간 빈공간 처리
		System.out.printf("[%-20s]\n", url); // %-20s: 왼쪽 정렬. 뒤에 남는 공간 빈공간 처리
		System.out.printf("[%.8s]\n", url); // %.8s: 왼쪽 정렬 및 왼쪽에서 8글자만 출력
	}
}
