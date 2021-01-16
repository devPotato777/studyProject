package heisely.ch04;

// FlowEx23. while문(1)
public class Ex23 {
	public static void main(String[] args) {
		int i = 5;

		while (i-- != 0) { // i는 1씩 줄어들고, i가 0이 아닐 때까지 반복
			System.out.println(i + " - I can do it.");
		}
	}
}
