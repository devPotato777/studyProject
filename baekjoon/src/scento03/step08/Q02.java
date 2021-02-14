package scento03.step08;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int n = 1; // 껍질 번호 (1을 둘러싸고 있는 것부터 첫 번째 껍질이라고 가정)

		if (a == 1) {
			System.out.println(a);
		} else {
			while (true) {
				if (3 * n * (n - 1) + 2 <= a && a <= 3 * n * (n + 1) + 1) { // 규칙 맨 앞 숫자와 맨 뒤 숫자가 계차수열을 이룸 (n>=1)
					// 입력한 수가 이 사이에 있으면 껍질 번호 +1 출력
					System.out.println(n + 1); // 1을 포함해서 통과하는 횟수를 생각하기 때문에 +1 해서 출력
					break; // 반복문을 벗어난다.
				}
				n++; // 조건에 맞지 않으면 껍질 번호 증가
			}
		}

	}

}
