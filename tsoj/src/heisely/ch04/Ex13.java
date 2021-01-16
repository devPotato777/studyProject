package heisely.ch04;

// FlowEx13. for문(2)
public class Ex13 {
	public static void main(String[] args) {
		int sum = 0; // 합계를 저장하기 위한 변수 선언 및 초기화

		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum+i
			System.out.println("1부터 " + i + "까지의 합: " + sum);
		}
	}
}
