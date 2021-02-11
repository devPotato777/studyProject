package heisely.ch06;

// BlockTest.
public class Ex27 {
	static { // 클래스 초기화 블럭
		// 1) Ex27이 메모리에 로딩될 때 가장 먼저 수행되어 출력됨. 단 최초 1회만 수행.
		System.out.println("static { }");
	}

	{ // 인스턴스 초기화 블럭
		// 3) 메인메서드 출력 후 Ex27인스턴스가 생성되면서 인스턴스 초기화 블럭이 출력.
		// 클래스초기화블럭과 달리 인스턴스가 생성될 때마다 수행됨.
		System.out.println("{ }");
	}

	public Ex27() {
		// 4) 마지막으로 생성자 출력
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		// 2) static블럭(클래스 초기화 블럭) 이후 main메서드가 수행되어 프린트문 출력
		System.out.println("Ex27 bt = new Ex27(); ");
		Ex27 bt = new Ex27();

		System.out.println();

		System.out.println("Ex27 bt2 = new Ex27(); ");
		Ex27 bt2 = new Ex27();
	}
}
