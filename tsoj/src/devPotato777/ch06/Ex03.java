package devPotato777.ch06;

// p.238
public class Ex03 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		// t2가 참조하고 있던 인스턴스는 더 이상 사용할 수 없게 된다.
		// 자신을 참고하고 있는 참조변수가 하나도 없는 인스턴스는 더 이상 사용되어질 수 없으므로 
		// '가비지 컬렉터 (Garbage Collector)'에 의해서 자동적으로 메모리에서 제거된다.
		t2 = t1;		// t1이 저장하고 있는 값 (주소) 을 t2에 저장한다.
		t1.channel = 7; // channel의 값을 7로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}

}
