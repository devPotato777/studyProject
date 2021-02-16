package devPotato777.ch07;

final class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() {
		// ...
	}

	public static Singleton getInstance() {
		if (s == null)
			s = new Singleton();

		return s;
	}
}

// p.352 SingletonTest
public class Ex14 {

	public static void main(String[] args) {
//		Singleton s = new Singleton();	// 에러! Singleton() has private access in Singleton
		Singleton s = Singleton.getInstance();

	}

}
