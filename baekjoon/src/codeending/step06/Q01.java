package codeending.step06;

/*
 * 
 */
public class Q01 {

		 long sum(int[] a) {
				long sum = 0;	// a 배열 정수 합 변수
		        
				for(int i = 0; i < a.length; i++) {
					sum += a[i];
				}
				return sum;
			}
	
}
