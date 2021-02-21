package heisely.ch07;

// SuperTest.
class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method(); // 이 경우 x, this.x, super.x 모두 같은 변수를 의미하므로 모두 같은 값(x=10)이 출력
	}
}