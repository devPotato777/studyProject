package devPotato777.ch06;

/*
 * main메서드도 재귀호출이 가능하다.
 * 아래 코드는 아무런 조건 없이 계속 자신을 호출하기 때문에 무한반복에 빠진다.
 * 
 * main메서드가 종료되지않고 호출스택에 계속 쌓이다가 
 * 메모리의 한계를 넘게 되어 StackOverflowError가 발생하여 프로그램이 비정상적으로 종료된다. 
 */

// p.276
public class Ex17 {

	public static void main(String[] args) {
		main(null); // 재귀호출. 자기 자신을 다시 호출한다.

	}

}
