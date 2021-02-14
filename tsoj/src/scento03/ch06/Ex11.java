package scento03.ch06;
//ReferenceParamEx2
public class Ex11 {

	public static void main(String[] args) {
		int[] x = { 10 };
		System.out.println("main(): x = " + x[0]);

		change(x);
		System.out.println("After change(x)");
		System.out.println("main(): x = " + x[0]);
	}

	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change(): x = " + x[0]);
	}

}
