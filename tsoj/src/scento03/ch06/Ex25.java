package scento03.ch06;

//CarTest2
public class Ex25 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");

		System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);
	}

}
