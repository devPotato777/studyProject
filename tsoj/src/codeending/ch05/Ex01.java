package codeending.ch05;
/*
 *  배열(array)
 *  
 *  배열(array)란?
 *  같은 타입의 여러 변수를 하나의 묶음으로 다를 것을 '배열(array)'이라고 한다.
 *  여기서 중요한 것은 '같은 타입'이어야 한다는 것이며, 서로 다른 타입의 변수들로 구성된 배열은 만들 수 없다.
 *  변수 선언과 달리 다뤄야할 데이터의 수가 아무리 많아도 단지 배열의 길이만 바꾸면 된다.
 *  변수와 달리 배열은 각 저장공간이 연속적으로 배치되어 있다는 특징이 있다.
 *  
 *  배열 선언  : 1)타입[] 변수이름; 2)타입 변수이름[]: 
 *  			//배열을 선언(배열을 다루기 위한 참조변수 선언)
 *  배열의 생성 : 변수이름 = new 타입[길이];
 *  			//배열을 생성(실제 저장공간을 생성)
 *  
 *  선언과 생성을 동시에 하기  : 타입[] 변수이름 = new 타입[길이];
 *  
 *  인덱스는 배열의 요소마다 붙여진 일련번호 
 *  인덱스(index)의 범위는 0부터 '배열길이-1'까지
 *  index로 상수 대신 변수나 수식도 사용할 수 있다.
 *  index의 범위를 벗어난 값을 index로 사용하지 않아야 한다.
 *  ArrayIndexOutBoundsExcetion 에러 발생 
 *  
 */
public class Ex01 {

	public static void main(String[] args) {
		int [] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70; // score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4]; // int tmp = score[3] + score[4]
		
		//for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}
		
		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n",7,score[7]);//index의 범위를 벗어난 값
				
	}//main

}
