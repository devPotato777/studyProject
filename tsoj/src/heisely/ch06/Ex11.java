package heisely.ch06;

// ReferenceParamEx2
public class Ex11 {
	public static void main(String[] args) {
		int[] x = { 10 }; // 크기가 1인 배열. x[0] = 10;
		System.out.println("main(): x = " + x[0]);

		change(x);
//		Data class의 인스턴스 대신 길이가 1인 배열 x를 사용하도록 변경한 것
//		배열도 객체와 같이 참조변수를 통해 데이터가 저장된 공간에 접근하므로
//		Data class 타입의 참조변수 d와 같이 변수 x도 int배열타입의 참조변수이므로 같은 결과를 얻음
		System.out.println("After change(x)");
		System.out.println("main(): x = " + x[0]);
	}

	static void change(int[] x) { // 참조형 매개변수
		x[0] = 1000;
		System.out.println("change(): x = " + x[0]);
	}
}
