package heisely.ch04;

// FlowEx14. for문(3)
public class Ex14 {
	public static void main(String[] args) {
		System.out.println("i \t j");
		System.out.println("-------------");
		for (int i = 1, j = 10; i <= 10; i++, j--)
			System.out.printf("%d \t %d\n", i, j);
	}
}
