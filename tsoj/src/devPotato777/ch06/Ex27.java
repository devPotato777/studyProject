package devPotato777.ch06;

// p.303
public class Ex27 {
	static {
		System.out.println("static { }");
	}	// 클래스 초기화 블럭
	
	{
		System.out.println("{ }");
	}	// 인스턴스 초기화 블럭
	
	public Ex27() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		Ex27 bt = new Ex27();

		System.out.println("BlockTest bt2 = new BlockTest(); ");
		Ex27 bt2 = new Ex27();

	}

}
