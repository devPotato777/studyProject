package devPotato777.ch04;

public class Ex14 {

	public static void main(String[] args) {
		for (int i = 1, j = 10; i <= 10; i++, j--)
			System.out.printf("%d \t %d%n", i, j);
		
		for (int i = 1; i <= 10; i++)
			System.out.printf("%d \t %d%n", i, 11-i);
		//	i와 j를 더한 값이 11로 일정하다는 것을 알 수 있다.
		//	i + j = 11
		//	j = 11 - i
	}
}
