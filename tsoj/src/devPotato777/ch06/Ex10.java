package devPotato777.ch06;

// Ex09에 선언되어 있으므로 주석처리
//class Data {
//	int x;
//}

// p.265 참조형 매개변수
public class Ex10 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		
	}

	static void change(Data d) { // 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다. (read & write)
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
