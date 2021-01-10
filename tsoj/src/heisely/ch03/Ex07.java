package heisely.ch03;

// OperatorEx7
public class Ex07 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte) (a * b); // Ex06(OperatorEx6)와 같은 이유로 명시적 형변환 필요
		System.out.println(c);
	}
}
