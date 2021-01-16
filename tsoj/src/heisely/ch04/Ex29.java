package heisely.ch04;

// FlowEx29. do-while문(2)
public class Ex29 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print("i = " + i + " ");
			
			int tmp = i; // 이렇게 지정해주지 않으면 i=1에서 시작할 때, do-while문에서 while문의 조건을 만족시키지 못하므로 i=1이 계속 반복된다.
			do {
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					// tmp%10%3==0: 3의 배수인지 확인 
					// tmp%10!=0: tmp%10%3==0이 tmp%10=0일때도 성립하므로 0인경우를 제외해주기 위함.
					System.out.print("짝");
				}
			} while ((tmp/=10) != 0); // tmp를 10으로 나눈 값이 0일 때까지 반복 >> 0이 되면 종료
			System.out.println();
		}
	}
}
