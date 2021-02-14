package scento03.step08;

import java.util.Scanner;

//V미터
//A 낮 올라감
//B 밤 내려감
//1≤B<A≤V≤1000000000
public class Q03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int A = 100;
		int B = 99;
		int V = 1000000000;

		int h = 0; // 달팽이가 올라간 높이
		int d = 0; // 일수

		while (h < V) {
			d++;
			h += A;
			if (h >= V)
				break;
			h -= B;
		}
		System.out.println(d);

	}

}
