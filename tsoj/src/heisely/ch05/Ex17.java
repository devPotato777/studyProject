package heisely.ch05;

// 2. String배열
// ArrayEx17 - command라인을 통해 입력받기 >> cmd창이나 Arguments 입력으로 출력
public class Ex17 {
	public static void main(String[] args) {
		if (args.length != 3) {// 입력된 개수가 3개가 아니면
			System.out.println("usage: java Ex17.java NUM1 OP NUM2");
			System.exit(0); // 프로그램 종료
		}

		int num1 = Integer.parseInt(args[0]); // 문자열을 숫자로 변환
		char op = args[1].charAt(0); // 문자열을 문자(char)로 변환
		int num2 = Integer.parseInt(args[2]);
		int result = 0;

		switch (op) { // switch문의 수식으로 char타입의 변수도 가능
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case 'x':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("지원되지 않는 연산입니다.");
		}
		System.out.println("결과: " + result);
	}
}
