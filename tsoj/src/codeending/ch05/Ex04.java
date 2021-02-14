package codeending.ch05;
/*
 * System.arraycopy()를 이용한 배열의 복사
 * for문 대신 System클래스의 arraycopy()를 사용하면 보다 간단하고 빠르게 배열을 복사 할 수 있다.
 * for문은 배열의 요소 하나하나에 접근해서 복사하지만, arraycopy()는 지정된 범위의 값들을 한 번에 통째로 복사.
 * 각 요소들이 연속적으로 저장되어 있다는 배열의 특성때문에 이렇게 처리하는 것이 가능
 * 
 * System.arraycopy(num, 0, newNum, 0, num.length);
 * -> new[0]에서 newNum[0]으로 num.length개의 데이터를 복사
 * 복사하려는 배열의 위치가 적절하지 못하여 복사려는 내용보다 여유 공간이 적으면 에러
 * ArrayIndexOutOfBoundsException
 */
public class Ex04 {

	public static void main(String[] args) {
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char [] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		// 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
	}

}
