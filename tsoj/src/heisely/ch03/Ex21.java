package heisely.ch03;

//OperatorEx21
public class Ex21 {
	public static void main(String[] args) {
		System.out.printf("10 == 10.0f	\t%b\n", 10 == 10.0f); //  int와 float 비교시 int를 float로 변환 후 비교. 따라서 true.
		System.out.printf("'0' == 0	\t%b\n", '0' == 0); // '0'의 유니코드 값은 48이므로 false
		System.out.printf("'A' == 65	\t%b\n", 'A' == 65); // 'A'의 유니코드 값은 65이므로 true
		System.out.printf("'A'>'B'	\t	%b\n", 'A' > 'B'); // 'B'의 유니코드 값은 66이므로 false
		System.out.printf("'A'+1 != 'B' \t	%b\n", 'A'+1 != 'B'); // 'A'+1 = 64+1 = 65 = 'B', false
	}
}
