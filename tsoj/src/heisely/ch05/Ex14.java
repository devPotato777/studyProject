package heisely.ch05;

// 2. String배열 
// ArrayEx14 - char배열과 String 클래스(1)
// String 배열 = char배열 + 메서드
public class Ex14 {
	public static void main(String[] args) {
		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i); // src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt(" + i + "): " + ch);
		}

		// String을 char[]로 변환
		char[] chArr = src.toCharArray();

		// char[] 출력
		System.out.println(chArr);
	}
}
