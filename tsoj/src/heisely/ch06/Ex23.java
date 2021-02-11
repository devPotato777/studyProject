package heisely.ch06;

// ConstructorTest.
class Data1 {
	int value;
	// 생성자 설정 안함 --> 호출 시 Default 생성자(매개변수 없는 생성자)가 자동으로 생성
}

class Data2 {
	int value;

	Data2(int x) { // 매개변수가 있는 생성자
		value = x; // 매개변수로 받은 x값을 value에 저장
	}
}

public class Ex23 {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(); // compile error 발생 
		// --> 매개변수 있는 생성자를 선언했기 때문에 매개변수 없는 생성자를 호출할 수 없음.
		
		// 개인적으로 추가.
		Data2 d2 = new Data2(2);
		System.out.println(d1.value); // 입력한 값이 없어서 0으로 출력
		System.out.println(d2.value); // 입력한 값(x)이 2이므로 value값=2 출력
	}
}
