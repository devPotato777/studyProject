package heisely.ch07;

// PointTest2.
// Ex07에서 Point2 클래스와 Point3D 클래스를 응용해야 해서 Point3, Point3D2로 정의함
class Point3 {
	int x = 10;
	int y = 20;

	public Point3(int x, int y) {
		super(); // 다른 생성자를 호출하지 않기 때문에 컴파일러가 super();를 자동으로 삽입
		// super(): Point의 조상인 Object 클래스의 기본 생성자인 Object()를 의미
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point3 {
	int z = 30;

	public Point3D2(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	Point3D2() {
		this(100, 200, 300); // Point3D2(int x, int y, int z) 호출
	}
}

public class Ex08 {
	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}
