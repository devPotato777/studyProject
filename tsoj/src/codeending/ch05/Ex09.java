package codeending.ch05;

import java.util.*;

/*
 * 배열의 활용
 * 임의의 값으로 배열 채우기 : 연속 또는 불연속적인 값들로 배열을 초기화 한다.
 */
public class Ex09 {

	public static void main(String[] args) {
		int[] code = {-4, -1, 3, 6, 11}; //불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random()*code.length);
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
	}//main의 끝

}
