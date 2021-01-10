package heisely.ch03;

//OperatorEx4
public class Ex04 {
	public static void main(String[] args) {
		int i = -10;
		i = +i; // +(-10) = -10
		System.out.println(i);

		i = -10;
		i = -i; // -(-10) = 10
		System.out.println(i);
	}
}
