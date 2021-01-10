package heisely.ch03;

//OperatorEx5
public class Ex05 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		/*
		 * 10 / 4 = 2.5지만, 두 변수가 모두 int일 때에는 결과값도 int로 반환 따라서 10 / 4 = 2로 반환된다.
		 */
		System.out.printf("%d / %f = %f\n", a, (float) b, a / (float) b);
		// 둘 중 하나가 float값이면 float값으로 반환됨.

		/* 만약 b=0이라면?
			b = 0;
			System.out.printf("%d / %d = %d\n", a, b, a / b); // 에러 발생
		
			나누는 수가 0일때에는 ArithmeticException이 나온다. 이를 처리하기 위해서는 try-catch()문이 필요하다.
			이는	Ch08.Exception Handling에서 다룬다.
			
			try {
				int c = 10;
				int d = 0;
				System.out.printf("%d / %d = %d\n", c, d, c / d);
			} catch (ArithmeticException e) {
				System.out.println("예외발생: " + e.getMessage());
			}	
		 */
		

	}
}
