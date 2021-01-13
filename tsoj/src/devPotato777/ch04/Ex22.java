package devPotato777.ch04;

/*
 * 향상된 for문
 * JDK1.5부터 배열과 컬렉션에 저장된 요소에 접근할 때
 * 기존보다 편리한 방법으로 처리할 수 있도록 for문의 새로운 문법이 추가되었다.
 * 
 * for (타입 변수명 : 배열 또는 컬렉션) {
 * 		//	반복할 문장
 * }
 * 
 * 향상된 for문은 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다는 제약이 있다.
 */

public class Ex22 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();

		for (int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	} // main의 끝
}
