package codeending.ch06;
//Exception in thread "main" java.lang.StackOverflowError
//무한호출 >> 호출스택 한계 넘는다 
public class Ex17 {

	public static void main(String[] args) {
		main(null); // 재귀호출. 자기 자신을 다시 호출한다.
	}

}
