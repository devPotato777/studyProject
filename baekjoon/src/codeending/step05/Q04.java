package codeending.step05;

import java.util.*;

/*
 * 나머지
 * 
 * 문제 : 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
 * 		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 * 
 * 출력 : 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 * 
 * 입력 예제 : 1
 *          2
 *          3
 *          4
 *          5
 *          6
 *          7
 *          8
 *          9
 *          10
 * 출력 예제 : 10
 * 
 * 
 */
public class Q04 {

	public static void main(String[] args) {
		//자바의 정석 Ex10 활용(오름차순)
		N3052();
		
	}
	public static void N3052() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int tmp = 0;
		int cnt = 1;
		
		for(int i=0; i<arr.length; i++) { //배열에 변수 넣기
			arr[i] = sc.nextInt()%42;
//			System.out.println("배열"+ arr[i]);
		}
		
		
		for(int i=0; i<arr.length-1;i++) {
			boolean changed = false; //초기화 
			
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					changed = true;
				}
			}
			
			if(!changed) break;
		}
		
//		for(int i=0; i <arr.length; i++)
//			System.out.println("sort"+arr[i]);
		
			for(int i=0; i<arr.length-1; i++) {
			
				if(arr[i] != arr[i+1]) {
					cnt++;
				}else {
					
				}
			
		}
		
		System.out.println(cnt);
		
	}
	
	public static void betterCode() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int tmp = 0;
		int cnt = 1;
		
		for(int i=0; i<arr.length; i++) { //배열에 변수 넣기
			arr[i] = sc.nextInt()%42;
		}
		
		Arrays.sort(arr);
		
			for(int i=0; i<arr.length-1; i++) {
			
				if(arr[i] != arr[i+1]) {
					cnt++;
				}
		}
		System.out.println(cnt);
	}
	
}
