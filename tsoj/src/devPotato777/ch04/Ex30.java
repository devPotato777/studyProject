package devPotato777.ch04;

/*
 * break문
 * 자신이 포함된 가장 가까운 반목문을 벗어난다.
 * 주로 if문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어나도록 한다.
 */

public class Ex30 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while (true) {
			if (sum > 100)
				break;
			++i;
			sum += i;

			// sum += ++i; // 위의 두 줄 코드와 같은 코드

		} // end of while

		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}
}