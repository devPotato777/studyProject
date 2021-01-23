package heisely.ch05;

import java.util.Arrays;

// 1. 배열(Array)
// ArrayEx2.
public class Ex02 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 85, 80, 70, 60};
		int[] iArr3 = {100, 85, 80, 70, 60};
		char[] chArr = {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length; i++) { // iArr1.length: iArr1의 배열의 길이
			iArr1[i] = i+1; // 1~10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1; // 1~10의 랜덤한 값을 배열에 저장
		}
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+", ");
		}
		System.out.println();
		// Arrays.toString(배열명): 배열의 모든 요소를 '[첫 번째 요소, 두 번째 요소, ...]'의 형식의 문자열로 만들어서 반환
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3); // iArr은 참조변수이므로 변수에 저장된 값, 즉 '배열의 주소'가 출력 됨
		System.out.println(chArr); // println() 메서드는 char배열일때에만 배열 요소를 전부 출력함.
	}
}
