package heisely.ch03;

// OperatorEx15
public class Ex15 {
	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char) (lowerCase - 32); // lowerCase와 upperCase의 유니코드 차이는 32, 계산값은 int이므로 'A' 출력을 위해 형변환 해줌.
		System.out.println(upperCase);
	}
}
