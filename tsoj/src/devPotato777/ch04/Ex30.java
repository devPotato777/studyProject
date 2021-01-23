package devPotato777.ch04;

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