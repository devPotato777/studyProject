package heisely.ch05;

// 2. String배열 
// ArrayEx15 - char배열과 String 클래스(2)
// String 배열 = char배열 + 메서드
public class Ex15 {
	public static void main(String[] args) {
		String source = "SHOSHELP";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		String result = "";

		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i) - 'A']; // 'S'-'A'=18
		}
		System.out.println("source: " + source);
		System.out.println("morse: " + result);
	}
}
