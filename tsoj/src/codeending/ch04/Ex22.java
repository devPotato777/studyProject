package codeending.ch04;
/*
 * 향상된 for문
 * for( 타입 변수명 : 배열 또는 컬렉션) { //반복할 문장}
 * 
 * 타입은 배열 또는 컬렉션의 요소의 타입
 * 배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장
 * 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있는 제약이 있음
 */
public class Ex22 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) 
			System.out.printf("%d", arr[i]);
		System.out.println();
		
		for(int tmp : arr) {
			System.out.printf("%d", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum="+sum);
	} //main의 끝

}
