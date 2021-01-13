package codeending.ch04;
/*
 * while문
 * while(조건식){// 조건식의 연산결과가 참(true)인 동안, 반복될 문장들을 적는다.}
 * 
 * 조건식이 참(true)이면 블럭{}안으로 들어가고, 거짓(false)이면 while무을 벗어난다.
 * 블럭{}의 문장을 수행하고 다시 조건식으로 돌아간다.
 * 
 * for문과 while식은 항상 서로 변환이 가능
 * 초기화나 증감식이 필요하지 않은 경우라면, while문에 더 적합
 * 
 * 주의! for문과 달리 while문의 조건식은 생략할 수 없다.
 * while문의 조건식이 항상 참이 되도록 하려면 반드시 true를 넣어야 한다.
 * 무한 반복문은 반드시 블럭{} 안에 조건문을 넣어서 특정 조건을 만족하면 무한 반복문을 벗어나도록 해야 한다.
 */
public class Ex23 {

	public static void main(String[] args) {
		int i = 5;
		
		while(i--!=0) {
			System.out.println(i + " - I can do it.");
		}
	} // main의 끝
	
	/*
	 * 1.후위 연산자와 쓸때
	 * while(i--!=0) { System.out.println(i); }
	 *  는 
	 * while(i!=0) { 
	 * 	i--;
	 * 	System.out.println(i); } 
	 * 와 같다.
	 */
	
	/*
	 * 2.전위 연산자와 쓸때
	 * while(i--!=0) { System.out.println(i); }
	 *  는 
	 *  i--; //while문을 벗어남
	 * while(i!=0) { 
	 * 	System.out.println(i); } 
	 * 와 같지 않다.
	 */
	
}
