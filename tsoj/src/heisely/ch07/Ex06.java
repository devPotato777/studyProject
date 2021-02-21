package heisely.ch07;

// SuperTest2.
// Ex05에서 정의한 class Parent는 그대로 사용하고, Child 클래스는 새로 정의해야 해서 Child2로 정의함.
class Child2 extends Parent {
	int x = 20;

	void method() {
		System.out.println("x=" + x); // Child 클래스의 x값(=20)
		System.out.println("this.x=" + this.x); // Child 클래스의 x값(=20)
		System.out.println("super.x=" + super.x); // Parent 클래스의 x값(=10)
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}
