package heisely.ch07;

// FinalCardTest.
// Ex03.DeckTest에서 class Card를 정의했기 때문에 여기에선 class Card2로 정의
class Card2 {
	final int NUMBER; // 상수이지만 선언과 함께 초기화 하지 않고
	final String KIND; // 생성자에서 단 한 번만 초기화 할 수 있다.
	static int width = 100;
	static int height = 250;

	Card2(String kind, int num) {
		// 매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화
		this.KIND = kind;
		this.NUMBER = num;
	}

	Card2() {
		this("HEART", 1);
	}

	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class Ex12 {
	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 10);
//		c.NUMBER = 5; // Error! cannot assign a value to final variable NUMBER
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());
	}
}
