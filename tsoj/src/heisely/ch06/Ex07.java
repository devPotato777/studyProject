package heisely.ch06;

// CallStackTest. JVM의 메모리 구조
public class Ex07 {
	public static void main(String[] args) {
		firstMethod(); // static메서드는 객체 생성 없이 호출 가능
		// firstMethod() 호출 > firstMethod()에서 secondMethod() 호출 > secondMethod() 내 println()문 호출
	}
	static void firstMethod() {
		secondMethod();
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

