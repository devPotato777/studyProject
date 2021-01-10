package heisely.ch02;

// VarEx2
public class Ex02 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0; // 값을 변경해주기 위한 변수 선언 및 초기화
		System.out.println("x: " + x + ", y: " + y);

		tmp = x; // x의 값을 tmp에 저장 ==> tmp=10
		x = y; // y의 값을 x에 저장 ==> x=20
		y = tmp; // tmp의 값을 y에 저장 ==> y=10
		System.out.println("x: " + x + ", y: " + y);
	}
}
