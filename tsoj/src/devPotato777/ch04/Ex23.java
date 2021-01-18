package devPotato777.ch04;

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