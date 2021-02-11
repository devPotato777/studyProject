package heisely.ch06;

// MainTest
public class Ex17 {
	public static void main(String[] args) {
		main(null); // 재귀호출, 자기 자신을 다시 호출
//		아무런 조건 없이 자기 자신을 계속해서 호출하기 때문에 무한 호출에 빠지게 됨
// 		main()메서드가 종료되지 않고 호출스택에 계속해서 쌓이게 되므로 결국 호출스택의 메모리 한계를 넘게 되고,
//		StackOverflowError가 발생하여 프로그램이 비정상적으로 종료됨
	}
}
