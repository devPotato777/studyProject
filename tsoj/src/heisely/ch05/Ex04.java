package heisely.ch05;

// 1. 배열(Array)
// ArrayEx4. 배열의 복사(2) - System.arraycopy 이용
public class Ex04 {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(abc);
		System.out.println(num);

		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만들기
		// 1. abc의 배열의 길이와 num의 배열의 길이를 합한 것 만큼 배열크기 지정
		char[] result = new char[abc.length + num.length];
		// 2. abc[0]에서 result[0]으로 abc.length만큼 데이터 복사(index: 0 ~ abc.length-1)
		System.arraycopy(abc, 0, result, 0, abc.length);
		// 3. num[0]에서 result[abc.length]로 num.length만큼 복사(index: abc.length ~ num.length-1)
		System.arraycopy(num, 0, result, abc.length, num.length);
		// 4. result 출력
		System.out.println(result);

		// 배열 abc를 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);

		// num의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
}
