package heisely.ch03;

// OperatorEx6
public class Ex06 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
//		byte c = a + b; // a+b로만 적으면 에러! default값이 int이므로 명시적 형변환을 해줘야한다. 
		byte c = (byte) (a + b);
		System.out.println(c);
	}
}
