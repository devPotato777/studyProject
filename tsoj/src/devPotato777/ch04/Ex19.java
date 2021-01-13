package devPotato777.ch04;

/*
 * 각 반복문이 3번씩 반복하므로 모두 27번 (3*3*3=27)이 반복된다.
 * i, j, k가 각각 1, 2, 3일 때
 * 식 "" + i + j + k는 아래와 같이 계산된다.
 * "" + i + j + k
 * => "" + 1 + 2 + 3
 * => "1" + 2 + 3
 * => "12" + 3
 * => "123"
 */

public class Ex19 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++)
			for (int j = 1; j <= 3; j++)
				for (int k = 1; k <= 3; k++)
					System.out.println("" + i + j + k);

	} // main의 끝
}