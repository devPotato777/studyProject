package heisely.ch03;

//OperatorEx12
public class Ex12 {
	public static void main(String[] args) {
		char c1 = 'a'; // c1에는 문자 'a'의 코드값인 97이 저장된다.
		char c2 = c1; // c1에 저장된 값이 c2에 저장된다.
		char c3 = ' '; // c3를 공백으로 초기화

		int i = c1 + 1; // 'a'+1 >> 97+1 >> 98

		c3 = (char) (c1 + 1); // c1+1이 int값으로 저장됐으므로 char형으로 전달하기 위해 명시적 형변환필요
		c2++; // c2++ >> c2+1 >> 98 저장(b)
		c2++; // c2++ >> c2+1 >> 99 저장(c)

		System.out.println("i = " + i);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
	}
}
