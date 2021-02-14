package devPotato777.ch06;

class Data {
	int x;
}

// p.264 기본형 매개변수
public class Ex09 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);

	}

	static void change(int x) { // 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다. (read only)
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
