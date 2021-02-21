package heisely.ch07;

// PointTest. - super() 예제
// Ex03에서 이미 Point 클래스를 정의해서 Point2 클래스로 진행
class Point2 {
	int x, y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Point2 {
	int z;

	Point3D(int x, int y, int z) {
		/*
		 * super(); // super(): Point3D의 조상인 Point클래스의 default 생성자인 Point()를 호출 this.x =
		 * x; this.y = y; // Point 클래스에 Point(); 생성자가 없으므로 컴파일 에러 발생
		 */
		super(x, y); // Point 클래스의 생성자형으로 super(x,y)를 넣어준다.
		this.z = z;
	}

	@Override
	// 오버라이딩: 상속받은 메서드의 내용을 변경
	String getLocation() {
		// TODO Auto-generated method stub
		return "x: " + x + ", y: " + y + ", z: " + z;
	}

}

public class Ex07 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
	}
}
