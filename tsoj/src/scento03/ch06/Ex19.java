package scento03.ch06;

//MyMathTest2
class MyMath2 {
	long a, b;

	long add() {
		return a + b;
	}

	long substract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	double divide() {
		return a / b;
	}

	static long add(long a, long b) {
		return a + b;
	}

	static long substract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static double divide(double a, double b) {
		return a / b;
	}
}

public class Ex19 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.substract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));

		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
