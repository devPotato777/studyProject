package heisely.ch06;

// CarTest2.
// Ex24. CarTest에서 정의한 class Car에 생성자 추가 후 작성
public class Ex25 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);
	}
}
