package scento03.ch06;

//BlockTest
public class Ex27 {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}

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
