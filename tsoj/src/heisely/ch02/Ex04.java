package heisely.ch02;

// PrintfEx1
public class Ex04 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';

		int finger = 10;
		long big = 100_000_000_000L; // long big=100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;

		int octNum = 010; // 8진수 10, 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2

		System.out.printf("b=%d\n", b); // %d: 10진정수의 형식으로 출력
		System.out.printf("s=%d\n", s);
		System.out.printf("c=%c, %d \n", c, (int) c); // %c: 문자로 출력
		System.out.printf("finger=[%5d]\n", finger); // %5d: 5자리수로 표현, 앞에 남는 자리는 빈공간으로 채움
		System.out.printf("finger=[%-5d]\n", finger); // %-5d: 뒤에 남는 자리는 빈공간으로 채움
		System.out.printf("finger=[%05d]\n", finger); // %05d: 빈공간은 0으로 채움
		System.out.printf("big=%d\n", big);
		System.out.printf("hex=%#x\n", hex); // %x: 16진 정수의 형식으로 출력, #은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d\n", octNum, octNum); // %o: 8진 정수의 형식으로 출력
		System.out.printf("hexNum=%x, %d\n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d\n", Integer.toBinaryString(binNum), binNum);

	}
}
