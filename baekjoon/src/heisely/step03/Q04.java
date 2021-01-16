package heisely.step03;

import java.io.*;
import java.util.*;

// for문
// 15552. 빠른 A+B
// 시간제한 - 1.5s
// BufferedReader & BufferedWriter 사용. BufferedWriter.fluch는 맨 마지막에 한 번만.
public class Q04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a + b;

			bw.write(sum + "\n");
		}
		bw.flush();

	}
}
