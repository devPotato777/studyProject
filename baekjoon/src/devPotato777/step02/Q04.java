package devPotato777.step02;

import java.util.Scanner;

/*
	14681번
	사분면 고르기
	
	문제
	흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
	사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다.
	"Quadrant n"은 "제n사분면"이라는 뜻이다.
	
	예를 들어, 
	좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 
	점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

	점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
	단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
	
	입력
	첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0)
	다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
	
	출력
	점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.

	알고리즘 분류
	- 구현
	- 기하학
*/

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min = -1_000;
		int max = 1_000;

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (!(((min <= x && max >= x) && x != 0) && ((min <= y && max >= y) && y != 0)))
			System.out.println("잘못 입력하셨습니다. 다시 실행해주세요.\n(−1000 ≤ x, y ≤ 1000; x, y ≠ 0)");

		else if (x > 0 && y > 0)
			System.out.println("1사분면");
		else if (x < 0 && y > 0)
			System.out.println("2사분면");
		else if (x < 0 && y < 0)
			System.out.println("3사분면");
		else
			System.out.println("4사분면");

		sc.close();
	}
}