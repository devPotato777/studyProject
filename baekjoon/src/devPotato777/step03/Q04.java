package devPotato777.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
	15552번
	빠른 A+B
	
	문제
	본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 
	입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.

	Java를 사용하고 있다면, 
	Scanner와 System.out.println 대신 
	BufferedReader와 BufferedWriter를 사용할 수 있다. 
	BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

	또한 입력과 출력 스트림은 별개이므로, 
	테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 
	테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
	
	입력
	첫 줄에 테스트케이스의 개수 T가 주어진다.
	T는 최대 1,000,000이다. 
	다음 T줄에는 각각 두 정수 A와 B가 주어진다. 
	A와 B는 1 이상, 1,000 이하이다.
	
	출력
	각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

	알고리즘 분류
	- 수학
	- 구현
	- 사칙연산
*/

/*
 * 버퍼 입출력 (p. 904)
 * 
 * 버퍼 (buffer)
 * - 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
 * - 입출력 속도 향상을 위해 버퍼 사용
 * 
 * 버퍼 플러시 (butter flush)
 * - 버퍼에 남아 있는 데이터를 출력시킴 (버퍼를 비우는 동작)
 * 
 * 버퍼를 이용한 입력
 * - BufferedReader
 * 	 readLine() 을 사용하면 데이터를 라인단위로 읽을 수 있다.
 * 
 * 버퍼를 이용한 출력
 * - BufferedWriter
 * 	 newLine() 을 사용하면 줄바꿈을 할 수 있다.
 * 
 * 
 * InputStreamReader 와 OutputStreamWriter
 * 바이트기반 스트림을 문자기반 스트림으로 연결시켜주는 역할을 한다.
 * 바이트기반 스트림의 데이터를 지정된 인코딩의 문자데이터로 변환하는 작업을 수행한다.
 */

public class Q04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			// 매 반복마다 문자열 분리를 위해 StringTokenizer 생성과 동시에 입력받는다.
			st = new StringTokenizer(br.readLine(), " ");
			
			// StringTokenizer의 반환 타입이 String이므로 Interger.parseInt()를 통해 int로 형변환 해준다.
			// 정수 두 개를 더한 값을 BufferedWriter.write() 에 넣어준다.
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		br.close();
		
		// 필수로 버퍼에 남아 있는 데이터를 출력시키고 (= 버퍼를 비운다.) 닫아줘야 한다. 
		bw.flush();
		bw.close();

	}
}