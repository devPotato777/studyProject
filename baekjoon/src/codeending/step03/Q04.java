package codeending.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


/* for문 빠른 A+B
 * 
 * 문제 : 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 * 		Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
 * 		BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 * 		또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
 * 
 * 입력 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 * 
 * 출력 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 * 
 * 예제 입력1: 5
 *			1 1
 *			12 34
 *			5 500
 *			40 60
 *			1000 1000
 * 예제 출력1 : 2
 *		     46
 *			 505
 *			 100
 *			 2000
 *
 */
public class Q04 {

	public static void main(String[] args) throws IOException {
		N15552();
//		other();
	}
	public static void N15552() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
		int T = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
 
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," "); //스페이스바로 입력을 나눠야 한다. enter 금지!!
//			st = new StringTokenizer(br.readLine(),"/"); // /로 입력을 나눠야 한다. 
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
        
		bw.flush();
		bw.close();
 
	}
	public static void other() throws IOException {
		  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringTokenizer st;
	        int TC = Integer.parseInt(br.readLine());
	 
	        for(int i=0; i<TC; i++) {
	            st = new StringTokenizer(br.readLine());
	            int A = Integer.parseInt(st.nextToken());
	            int B = Integer.parseInt(st.nextToken());
	            int sum = A+B;
	 
	            bw.write(sum + "\n");
	        }
	        bw.flush();
	}

}
