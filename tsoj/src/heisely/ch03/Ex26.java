package heisely.ch03;

// OperatorEx26
public class Ex26 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		System.out.printf("a=%d, b=%d\n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b\n", a != 0 || ++b != 0); // true. '||'연산자는 둘 중 하나만 참이어도 true로 반환. a!=0이 참이므로 true 반환.
		System.out.printf("a=%d, b=%d\n", a, b);
		System.out.printf("a==0 && ++b!=0 = %b\n", a == 0 && ++b != 0); // false. '&&'연산자는 둘 다 참이어야 true. a==0이 거짓이므로 false 반환.
		System.out.printf("a=%d, b=%d\n", a, b);
	}
}
