package codeending.ch05;
/*
 * 배열의 활용
 * 정렬하기(sort) : 오름차순, 내림차순으로 배열을 정렬
 */
public class Ex10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10)); //numArr[i]에 0~9까지 임의의수를 넣는다.
		}
		System.out.println();
		
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다. , 매 반복마다 changed를 false로 초기화 한다.
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) { //옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로.
				}
			}// end for j
			
			if(!changed) break; //자리바꿈이 없으면 반복문을 벗어난다.
			
			for(int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]); //정렬된 결과를 출력한다.
			System.out.println();
		} // end for i
	} // main의 끝 

}
