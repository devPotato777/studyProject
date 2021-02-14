package codeending.ch06;
/*
 * 재귀호출(recursive call)
 * 메서드의 내부에서 메서드 자신을 호출하는 것을 '재귀호출(recursive call)이라 하고,
 * 재귀호출을 하는 메서드를 '재귀메서드'라 한다.
 * 
 * 호출된 메서드는 값에 의한 호출을 통해, 원래의 값이 아닌 복사된 갑으로 작업하기  때문에 
 * 호출한 메서드와 관꼐없이 독립적인 작업수행이 가능하다. 
 * 
 * 무한반복을 막기위해 조건문은 필수다.
 * 
 * 
 */
public class Ex15 {
	static class FatorialTest{
		public static void main(String[] args) {
			int result = factorial(4);
			
			System.out.println(result);
		}
		static int factorial(int n) {
			int result = 0;
			
			if(n ==1)
				result = 1;
			else
				result = n * factorial(n-1) ; //다시 메서드 자신을 호출한다.
			return result;
		}
	} // class FatorialTest의 끝
} //class Ex15의 끝
