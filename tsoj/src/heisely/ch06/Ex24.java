package heisely.ch06;

// CarTest.
class Car {
	String color; // 색상
	String gearType; // 변속기 종류 - auto/manual
	int door; // 문의 개수

	// Ex24. CarTest1 생성자
//	Car() {} // Ex26의 생성자와 겹쳐서 주석처리

	// Ex24 ~ Ex26 공통 생성자
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}

	// Ex25. CarTest2 생성자
	Car(String color) {
		this(color, "auto", 4);
	}
	
	// Ex26. CarTest3 생성자
	Car(){
		this("white","auto",4);
	}
	
	Car(Car c){ // 인스턴스의 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
}

public class Ex24 {
	public static void main(String[] args) {
		// 매개변수가 없는 생성자를 통해 객체 생성
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;

		// 매개변수가 있는 생성자를 통해 객체 생성
		Car c2 = new Car("white", "auto", 4);

		System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);
	}
}
