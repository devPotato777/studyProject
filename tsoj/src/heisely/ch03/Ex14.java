package heisely.ch03;

//OperatorEx14
public class Ex14 {
	public static void main(String[] args) {
		char c = 'a';
		for (int i = 0; i < 26; i++) { // 0부터 25까지 i를 하나씩 증가시키며 블럭{} 안 내용 반복
			System.out.print(c++); // 'a'부터 26개의 문자 출력
		}
		System.out.println(); // 줄바꿈

		c = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.print(c++); // 'A'부터 26개의 문자 출력
		}
		System.out.println();

		c = '0';
		for (int i = 0; i < 10; i++) {
			System.out.print(c++); // '0'부터 10개의 문자 출력
		}
		System.out.println();
	}
}
