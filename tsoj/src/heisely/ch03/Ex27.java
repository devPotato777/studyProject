package heisely.ch03;

// OperatorEx27
public class Ex27 {
	public static void main(String[] args) {
		boolean b = true; // boolean타입의 변수 b를 true로 초기화
		char ch = 'C';

		// '!' 연산자: not 처리해주는 연산자.
		System.out.printf("b=%b\n", b);
		System.out.printf("!b=%b\n", !b);
		System.out.printf("!!b=%b\n", !!b);
		System.out.printf("!!!b=%b\n", !!!b);
		System.out.println();
		// b의 첫 값이 true이므로 true-false-true-false 순으로 나온다.

		System.out.printf("ch = %c\n", ch);
		System.out.printf("ch < 'a' || ch > 'z' = %b\n", ch < 'a' || ch > 'z');
		System.out.printf("!('a' <= ch && ch <= 'z') = %b\n", !('a' <= ch && ch <= 'z')); // 위의 식과 동일.
		System.out.printf("'a' <= ch && ch <= 'z' = %b\n", 'a' <= ch && ch <= 'z');

	}
}
