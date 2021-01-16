package heisely.ch04;

// FlowEx18. 중첩 for문(3)
public class Ex18 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
