package heisely.ch04;

// FlowEx26. while문(4)
public class Ex26 {
	public static void main(String[] args) {
		int sum = 0, i = 0;

		while ((sum += ++i) <= 100) { // i를 1씩 증가시키면서 더하고 sum에 저장, sum이 100이하일때까지 반복
			System.out.printf("i = %d >> sum = %d\n", i, sum);
		}
	}
}
