package heisely.ch07;

import static java.lang.System.out; // System.out을 out만으로 참조 가능
import static java.lang.Math.*; // Math.random() 같은 메서드 사용 시 random()만으로도 참조 가능

// StaticImportEx1.
public class Ex11 {
	public static void main(String[] args) {
		// System.out.println(Math.random());
		out.println(random());

		// System.out.println("Math.PI : " + Math.PI);
		out.println("Math.PI: " + PI);
	}
}
