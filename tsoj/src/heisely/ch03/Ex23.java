package heisely.ch03;

// OperatorEx23
public class Ex23 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\"	?	%b\n", "abc" == "abc");
		System.out.printf("str1==\"abc\"	?	%b\n", str1 == "abc");
		System.out.printf("str2==\"abc\"	?	%b\n", str2 == "abc");
		System.out.printf("str1.equals(\"abc\")	?	%b\n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\")	?	%b\n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\")	?	%b\n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\")	?	%b\n", str2.equalsIgnoreCase("ABC"));
//		'=='로 비교시 객체로 비교하므로 str=="abc"는 false값을 얻는다(다른 객체 - 나중에 자세히 배움)
//		.equals()는 객체가 달라도 내용이 같으면 true를 반환한다.
//		그러므로 문자열을 비교할 때에는 .equals()를 사용해야 한다.

	}
}
