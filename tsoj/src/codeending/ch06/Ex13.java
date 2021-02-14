package codeending.ch06;

public class Ex13 {
	static class RetrunTest{
		public static void main(String[] args) {
			Ex13.RetrunTest r = new Ex13.RetrunTest();
			
			int result = r.add(3,5);
			System.out.println(result);
			
			int[] result2 = {0}; //배열을 생성하고 result2[0]의 값을 0으로 초기화
			r.add(3,5,result2); //배열을 addd메서드의 매개변수로 전달
			System.out.println(result2[0]);
			
		}
		
		int add(int a, int b) {
			return a+ b;
		}
		
		void add(int a, int b, int[] result) {
			result[0] = a + b;//매개변수로 넘겨받은 배열에 연산결과를 저장
		}
	}//  class RetrunTest 끝
}// class Ex13의 끝
