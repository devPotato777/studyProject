package heisely.ch02;

// CharToCode
public class Ex07 {
	public static void main(String[] args) {
		char ch = 'A'; // char ch=65; 컴퓨터는 숫자로 기록되므로 A의 유니코드인 65 저장
		int code = (int) ch; // ch에 저장된 값을 int 타입으로 변환하여 저장한다.

		System.out.printf("%c=%d(%#X)\n", ch, code, code);

		char hch = '가'; // char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)\n", hch, (int) hch, (int) hch);
	}
}
