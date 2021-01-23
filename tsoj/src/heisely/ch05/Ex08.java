package heisely.ch05;

// 1. 배열(Array)
// ArrayEx8. 배열의 활용(4) - 섞기(Shuffle)(2)
public class Ex08 {
	public static void main(String[] args) {
		int[] ball = new int[45];

		// 각 배열의 요소에 1~45의 수 저장
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		int tmp = 0; // 두 값을 바꾸는 데에 사용할 임시 변수
		int j = 0; // 임의의 수를 저장할 변수

		// 배열 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값 섞기
		// 0번째부터 5번째요소까지 총 6개만 바꿈
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); // 0~44의 임의의 수

			// ball[i]와 ball[j]의 수 교환
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}

		// 배열 ball의 앞에서 6개의 요소를 출력
		for (int i = 0; i < 6; i++) {
			System.out.println("ball[" + i + "]=" + ball[i]);
		}
	}
}
