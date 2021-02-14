package devPotato777.step08;

import java.util.Scanner;

/*
2869번
달팽이는 올라가고 싶다

문제
땅 위에 달팽이가 있다. 
이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 
하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 
며칠이 걸리는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. 
(1 ≤ B < A ≤ V ≤ 1,000,000,000)

출력
첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
 */

public class Q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("입력");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();

		int tmp = 0;
		int cnt = 0;

		while (tmp < V) {
			cnt++;

			tmp += A;
			if (tmp >= V)
				break;
			tmp -= B;

			if (V - A == 0)
				break;

		}

		System.out.println(cnt);

	}

}
