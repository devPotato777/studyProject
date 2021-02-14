package scento03.ch06;

//MemberCall
public class Ex20 {

	int iv = 10;
	static int cv = 20;

	int iv2 = cv;
	static int cv2 = new Ex20().iv;

	static void staticMethod1() {
		System.out.println(cv);
		Ex20 c = new Ex20();
		System.out.println(c.iv);
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}

	static void staticMethod2() {
		staticMethod1();
		Ex20 c = new Ex20();
		c.instanceMethod1();
	}

	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}

}
