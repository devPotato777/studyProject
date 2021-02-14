package codeending.ch05;
/*
 * char배열과 String클래스
 * String클래스는 char배열에 기능(메서드)를 추가한 것이다. 
 * 
 * char배열과 String클래스의 한 가지 중요한 차이가 있는데,
 * String객체(문자열)는 읽을 수만 있을 뿐 내용을 변경할 수 없다는 것이다.
 * 
 * String클래스의 주요 메서드
 * char charAt(int index) : 문자열에서 해당 위치(index)에 있는 문자를 반환한다.
 * int length() : 문자열의 길이를 반환한다.
 * String substring(int from, int to) : 문자열에서 해당 범위(from~to)에 있는 문자열을 
 * 										반환한다. (to는 범위에 포함되지 않음)
 * boolean equlas(String str) : 문자열의 내용이 같은지 확인한다.
 * 								같으면 결과는 true, 다르면 false가 된다.
 * char[] toCahrArray() : 문자열을 문자배열(char[])로 변환해서 반환한다.
 * 
 * char배열과 String클래스의 변환
 * String str = new String(chArr); // char배열 -> String
 * char[] tmp = str.toCharArray(); // String -> char배열
 */
public class Ex14 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i) ; //src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt("+i+") : "+ch);
		}
		//String을 char[]로 변환
		char[] chArr = src.toCharArray();
		
		// char배열(char[])을 출력
		System.out.println(chArr);
	}

}
