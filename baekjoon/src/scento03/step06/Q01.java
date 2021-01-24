package scento03.step06;

public class Q01 {
	long sum(int[] a) {
		long sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
