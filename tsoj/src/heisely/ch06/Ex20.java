package heisely.ch06;

// MemberCall.
public class Ex20 {
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // 클래스 변수
	
	int iv2 = cv; // 인스턴스 변수는 클래스 변수를 사용할 수 있음.
//	static int cv2 = iv; // 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new Ex20().iv; // 클래스변수는 인스턴스변수를 사용하려면 객체를 생성해야 사용 가능.
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); // 에러. 클래스메서드에서 인스턴수변수 사용 불가.
		Ex20 c = new Ex20();
		System.out.println(c.iv); // 객체를 생성한 후에야 인스턴스변수 참조 가능.
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 인스턴스메서드에서는 인스턴스변수를 바로 사용 가능.
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // 에러. 클래스메서드에서는 인스턴스메서드 호출 불가.
		Ex20 c = new Ex20();
		c.instanceMethod1(); // 객체를 생성한 후에야 인스턴스메서드 참조 가능.
	}
	
	void instanceMethod2() {
		// 인스턴스메서드에서는 인스턴스메서드와 클래스메서드 모두 객체 생성 없이 바로 호출 가능.
		staticMethod1();
		instanceMethod1();
	}
}
