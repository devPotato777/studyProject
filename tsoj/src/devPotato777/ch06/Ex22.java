package devPotato777.ch06;

/*
	concatenate메서드는 매개변수로 입력된 문자열에 구분자를 사이에 포함시켜 결합해서 반환한다.
	가변인자로 매개변수를 선언했기 때문에 문자열을 개수의 제약없이 매개변수로 지정할 수 있다.
*/
// p.289
public class Ex22 {
	public static void main(String[] args) {
		String[] strArr = { "100", "200", "300" };

		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] { "1", "2", "3" }));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	}

	static String concatenate(String delim, String... args) {
		String result = "";

		for (String str : args) {
			result += str + delim;
		}

		return result;
	}
/*
	static String concatenate(String... args) {
		return concatenate("", args);
	}
*/
} // class
