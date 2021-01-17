package codeending.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/* while A+B - 4 ★(sc.hasNextInt())★
 * 
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 		 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력 : 각 테스트 케이스마다 A+B를 출력한다.
 * 
 * 입력 예제 : 1 1
 *          2 3
 *          3 4
 *          9 8
 *          5 2
 * 출력 예제 : 2
 *          5
 *          7
 *          17
 *          7
 */
public class Q02 {

	public static void main(String[] args) {
		N10951();
	}
	public static void N10951() {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
	}
	
	public static void other1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
 
		while( (str=br.readLine()) != null ){
		    
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		
		}
		System.out.print(sb);
	}
	public static void other2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
 
		while( (str=br.readLine()) != null ){
		    
			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			sb.append(a+b).append("\n");
		
		}
		System.out.print(sb);
	}
}
