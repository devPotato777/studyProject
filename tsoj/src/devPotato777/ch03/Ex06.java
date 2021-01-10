package devPotato777.ch03;

public class Ex06 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
//		byte c = a + b;	// 컴파일 에러가 발생한다. 명시적으로 형변환이 필요하다. byte c = (byte)(a+b);
		byte c = (byte)(a+b);
		System.out.println(c);

	}

}
