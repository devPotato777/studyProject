package codeending.ch03;

public class Ex06 {

	public static void main(String[] args) {
		byte a =10;
		byte b = 20;
		byte c = (byte)(a + b);
		//byte c = a + b; //(byte)(a + b) 명시적으로 형변환 필요. 컴파일 에러뜸.
		System.out.println(c);
		
	}

}
