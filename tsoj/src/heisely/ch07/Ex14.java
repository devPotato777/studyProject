package heisely.ch07;

// SingletonTest. - 생성자의 접근제어자
final class Singleton {
	private static Singleton s = new Singleton();

	public Singleton() {
	}

	public static Singleton getInstance() {
		if (s == null)
			s = new Singleton();

		return s;
	}

}

public class Ex14 {
	public static void main(String[] args) {
//		Singleton s = new Singleton(); // Error! Singleton() has private access in Singleton
		Singleton s = Singleton.getInstance();
	}
}
