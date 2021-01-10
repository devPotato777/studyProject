package heisely.ch02;

// StringEx
public class Ex03 {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;

		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); // 7+7=14
		System.out.println("" + 7 + 7); // 빈문자 뒤에 7+7은 문자열로 변환되므로 붙여 씀(77)
	}
}
