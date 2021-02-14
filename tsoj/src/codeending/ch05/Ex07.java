package codeending.ch05;
/*
 * 배열의 활용
 * 섞기(shuffle) : 배열의 요소의 순서를 반복해서 바꾼다. (카드섞기, 로또번호생성)
 */
public class Ex07 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i; // 배열을 0~9의 숫자로 초기화한다.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10); // 0~9중의 한 값을 임의로 얻는다. 
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp; 
			// numArr[0]과 numArr[n]의 값을 서로 바꾼다.
		}
		
		for(int i=0; i<numArr.length; i++){
			System.out.print(numArr[i]);
		}// main의 끝
	}
	
	public static void eff() { //더 효율적인 방법 p200
	int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i; // 배열을 0~9의 숫자로 초기화한다.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			int n = (int)(Math.random()*10); // 0~9중의 한 값을 임의로 얻는다. 
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp; 
			// numArr[i]과 numArr[n]의 값을 서로 바꾼다.
		}
		
		for(int i=0; i<numArr.length; i++){
			System.out.print(numArr[i]);
		}
	}
		

}
