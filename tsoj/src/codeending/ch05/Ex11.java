package codeending.ch05;
/*
 * 배열의 활용
 * 빈도수 구하기 : 배열에 어떤 값이 몇 개 저장되어 있는지 세어서 보여준다.
 */
public class Ex11 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10); // 0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++; 
			// 배열 counter는 0으로 초기화 된 상태.
			// 같은 counter[i]가 나오면 수를 1씩 올려서 중복된 숫자를 센다.
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"의 개수 : "+counter[i]);
		}
	}// main의 끝

}
