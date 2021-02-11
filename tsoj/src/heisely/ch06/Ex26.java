package heisely.ch06;

// CarTest3.
// Ex24. CarTest에서 정의한 class Car에 생성자 추가 후 작성
public class Ex26 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1); // c1의 복사본 c2 생성
		System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);

		c1.door = 100; // c1의 인스턴스변수 door의 값 변경
		// 인스턴스 c2는 c1을 복사해 생성된 것으로 서로 같은 상태를 갖지만, 메모리공간에 서로 독립적으로 존재하는 별도의 인스턴스.
		// 따라서 c2의 door값은 변경되지 않는다.
		System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);
	}
}
