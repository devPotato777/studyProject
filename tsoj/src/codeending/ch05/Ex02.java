package codeending.ch05;

import java.util.*;

/*
 * 배열의 길이
 * 배열을 생성할 때 괄호[]안에 길이를 적어줘야 하는데,
 * 배열의 길이는 배열의 요소의 개수, 즉 값을 저장할 수 있는 공간의 개수다.
 * 배열의 길이는 양의 정수(0포함), 최대값은 int타입의 최대값
 * 타입[] 배열이름 = new 타입[길이];
 * int[] arr = = new int[5]; //길이가 5인 int배열
 * 그런데 길이가 0인 배열도 생성이 가능.
 * 
 * 배열이름.length
 * 배열이름.length를 통해서 배열의 길이에 대한 정보를 얻을 수 있음.
 * 배열은 한번 생성하면 길이를 변경할 수 없기 때문에, 이미 생성된 배열의 길이는 변하지 않는다.
 * 즉, 배열이름.length는 상수다. 값을 읽을 수만 있을 뿐 변경할 수 없다.
 * 배열.length는 배열의 길이가 변경되면 자동적으로 변경된 배열의 길이를 값으로 
 * 갖기 때문에, 배열과 함께 사용되는 for문의 조건식을 일ㅇ리이 변경해주지 않아도 된다.
 * 
 * 배열의 길이 변경하기
 * 1.더 큰 배열을 새로 생성한다.
 * 2.기존 배열의 내용을 새로운 배열에 복사한다.
 * 애초에 좀 넉넉 잡아 메모리 낭비되지 않는 선에서 선언하면 좋다. 약 두배정도.
 * 
 * 배열의 초기화 
 * 배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화 됨.
 * 규칙이 있다면 for문을 통해 값을 넣어주면 좋다.
 * int[] score = new int[]{50, 60, 70, 80, 90}; //배열의 생성과 초기활르 동시에
 * 괄호 안에 값의 개수에 의해 배열의 길이가 자동으로 결정되기 때문에 배열의 길이 안적어도 된다.
 * new 코드 생략 가능. int[] score = {50, 60, 70, 80, 90};
 * 하지만 선언과 생성을 따로 하는 경우에는 생략할 수 없다.
 * int[] socre; , score = new int[]{50, 60, 70, 80, 90};
 * 
 * 배열의 출력
 * for문
 * Arrays.toString() 메서드 사용 -> 문자열로 반환
 * System.out.println(Arrays.toString(iArr); [100, 95 ,80, 70, 60]
 * 만일 iArr값을 바로 출력하면? 타입@주소가 나온다. 배열을 가르키는 참조변수 iArr의 값을 출력한다.
 * 예외적으로 char배열을 println메서드로 출력하면 각 요소가 구분자없이 그대로 출려된다.
 * System.out.println(chArr); // abcd가 출력
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char [] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i +1 ;//1~10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1; // 1~10의 값을 배열에 저장
		}
		
		//배열에 저장된 값들을 출력한다.
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3); //실행할 때 마다 달라질 수 있다.
		System.out.println(chArr);
	}

}
