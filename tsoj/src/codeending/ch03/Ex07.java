package codeending.ch03;

public class Ex07 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c  = (byte)(a*b);
		System.out.println(c);
		//300은 byte형의 범위를 넘기 때문에 byte형으로 변환하면 데이터 손실 발생 결국 44가 byte형 변수 c에 저장
	}

}
