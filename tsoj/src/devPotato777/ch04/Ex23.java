package devPotato777.ch04;

/*
 * while문
 * 
 * while (조건식) {
 * 			//	조건식의 연산결과가 참 (true)인 동안, 반복될 문장들을 적는다.
 * }
 * 
 * while문의 조건식은 생략불가
 * 조건식이 항상 참이 되게 하려면 true를 넣어야 한다.
 */

public class Ex23 {

	public static void main(String[] args) {
		int i = 5;
		
		// i-- 가 후위형이므로 조건식이 평가된 후에 i의 값이 감소된다.
		// i-- != 0  == (i = i - 1) ! = 0
		while (i-- != 0) {	// 4 3 2 1 0
			System.out.println(i + " - I can do it.");
		}
		
//		while (--i != 0) {	// 4 3 2 1
//			System.out.println(i + " - I can do it.");
//		}
	} // main의 끝
}