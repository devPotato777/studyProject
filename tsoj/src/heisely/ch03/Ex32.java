package heisely.ch03;

// OperatorEx32: 조건연산자 ?:
public class Ex32 {
	public static void main(String[] args) {
		// 변수 선언
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;

		// 변수 초기화
		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x; // x값이 음수이면 양수로 만든다.
		absY = y >= 0 ? y : -y; // y값이 음수이면 양수로 만든다.
		absZ = z >= 0 ? z : -z; // z값이 음수이면 양수로 만든다.

		// 조건연산자 중첩사용
		signX = x > 0 ? '+' : (x == 0 ? ' ' : '-'); // x가 양수이면 '+', 0이면 공백, 음수이면 '-'
		signY = y > 0 ? '+' : (y == 0 ? ' ' : '-'); // y가 양수이면 '+', 0이면 공백, 음수이면 '-'
		signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-'); // z가 양수이면 '+', 0이면 공백, 음수이면 '-'

		System.out.printf("x = %c%d\n", signX, absX);
		System.out.printf("y = %c%d\n", signY, absY);
		System.out.printf("z = %c%d\n", signZ, absZ);
	}
}
