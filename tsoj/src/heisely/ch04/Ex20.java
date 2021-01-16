package heisely.ch04;

// FlowEx20. 중첩 for문(5)
public class Ex20 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
	}
}
