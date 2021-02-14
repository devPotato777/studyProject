package heisely.ch06;

// ReferenceParamEx
// Ex09에서 정의한 Data class 사용
public class Ex10 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main(): x = " + d.x);

		change(d);
//		change메서드가 호출되면서 참조변수 d의 값(주소)이 매개변수 d에 복사됨
//		> d에 저장된 주소값으로 x에 접근이 가능해짐
//		> change()메서드에서 매개변수 d로 x의 값을 1000으로 변경
//		> change()메서드가 종료되면서 매개변수 d는 stack에서 제거됨
		System.out.println("After change(d)");
		System.out.println("main(): x = " + d.x);
	}

	static void change(Data d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("change(): x = " + d.x);
	}
}
