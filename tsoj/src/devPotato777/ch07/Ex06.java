package devPotato777.ch07;

//p.330 SuperTest2
public class Ex06 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	}

}

class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20;
	
	void method() {
		// x, this.x, super.x 모두 같은 변수를 의미하므로 모두 같은 값이 출력되었다.
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}