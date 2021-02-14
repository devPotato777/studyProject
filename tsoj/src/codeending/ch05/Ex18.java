package codeending.ch05;
/*
 * 다차원 배열
 * 
 * 2차원 배열의 선언과 인덱스
 * 타입[][] 변수이름: int[][] score;
 * 타입 변수이름[][] : int score[][];
 * 타입[] 변수이름[] : int[] score[];
 * 2차원 배열은 주로 테이블 형태의 데이터를 담는데 사용되며, 만일 4행3열의 데이터를 담기 위한 배열을 생성하려면
 * int[][] score = new int[4][3]; //4행 3열 2차원 배열을 생성한다.
 * int의 기본값인 0이 저장
 * 
 * 2차원 배열의 index
 * 배열은 행(row)와 열(column)로 구성되어 있기 때문에 index도 행과 열에 각각 하나씩 존재
 * index 범위 : 0 ~ 행,열의 길이 -1
 * 
 * 2차원 배열의 초기화
 * int[][] arr = new int[][]{{1,2,3}, {4,5,6}};
 * int[][] arr = {{1,2,3}, {4,5,6}}; //new int[][]가 생략됨
 */
public class Ex18 {

	public static void main(String[] args) {
		int[][] score = {
						{100, 100, 100}
					  , {20, 20, 20}
					  , {30, 30, 30}
					  , {40, 40, 40} 
			 };
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		for(int[] tmp : score) { //score의 각 요소(1차원 배열 주소)를 tmp에 저장
			for(int i : tmp) { //tmp는 1차원 배열을 가리키는 참조변수
				sum += i ;
			}
		}
		
		System.out.println("sum = "+sum);
	}

}
