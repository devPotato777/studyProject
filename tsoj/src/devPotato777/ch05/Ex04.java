package devPotato777.ch05;

// System.arraycopy()를 이용한 배열 복사
public class Ex04 {

	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(abc);
		System.out.println(num);
		
		// 배열 abc와 num을 붙여서 하나의 배열 (result)로 만든다.
		char[] result = new char[abc.length + num.length];
		
		// abc[0] 에서 result[0]으로 abc.length개의 데이터를 복사
		System.arraycopy(abc, 0, result, 0, abc.length);
		
		// num[0] 에서 result[abc배열의 길이부터]로 num.length개의 데이터를 복사
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		// 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number의 인덱스 6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
	}

}
