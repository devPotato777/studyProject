package heisely.ch06;

// MyMathTest2.
/*
# 클래스 메서드(static 메서드)와 인스턴스 메서드
1. 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.
	생성된 각 인스턴스는 서로 독립적이기 때문에 각 인스턴스의 변수(iv)는 서로 다른 값을 유지한다.
	그러나 모든 인스턴스에서 같은 값이 유지되어야 하는 변수는 static을 붙여서 클래스 변수로 정의해야 한다.
	
2. 클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.
	static이 붙은 변수(클래스변수)는 클래스가 메모리에 올라갈 때 이미 자동적으로 생성되기 때문이다.

3. 클래스 메서드(static 메서드)는 인스턴스 변수를 사용할 수 없다.
	인스턴스 변수는 인스턴스가 반드시 존재해야만 사용할 수 있는데,
	클래스메서드(static이 붙은 메서드)는 인스턴스 생성 없이 호출가능하므로 클래스 메서드가 호출되었을 때 인스턴스가 존재하지 않을 수도 있다.
	그래서 클래스 메서드에서 인스턴스 변수의 사용을 금지한다.
	반면에 인스턴스변수나 인스턴스 메서드에서는 static이 붙은 멤버들을 사용하는 것이 언제나 가능하다.
	인스턴스 변수가 존재한다는 것은 static변수가 이미 메모리에 존재한다는 것을 의미하기 때문이다.

4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.
	메서드의 작업내용 중에서 인스턴스 변수를 필요로 한다면, static을 붙일 수 없다.
	반대로 인스턴스 변수를 필요로 하지 않는다면 static 변수를 붙이자.
	메서드 호출 시간이 짧아지므로 성능이 향상된다.
	static을 안 붙인 메서드(인스턴스 메서드)는 실행 시 호출되어야 할 메서드를 찾는 과정이 추가적으로 필요하기 때문에 시간이 더 걸린다.
	
>> 정리
 - 클래스의 멤버변수 중 모든 인스턴스에 공통된 값을 유지해야하는 것이 있는지 살펴보고, 있으면 static을 붙여준다.
 - 작성한 메서드 중에서 인스턴스 변수나 인스턴스 메서드를 사용하지 않는 메서드에 static을 붙일 것을 고려한다.
 */
class MyMath2 {
	long a, b;
	
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() {return a+b;} // a,b는 인스턴스 변수
	long substract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) {return a+b;} // a,b는 지역변수
	static long substract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(double a, double b) {return a/b;}
}

public class Ex19 {
	public static void main(String[] args) {
		// 클래스 메서드 호출. 인스턴스 생성없이 호출 가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.substract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2(); // 인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스메서드는 객체생성 후에만 호출이 가능
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
