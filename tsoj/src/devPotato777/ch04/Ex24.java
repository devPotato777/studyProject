package devPotato777.ch04;

public class Ex24 {

	public static void main(String[] args) {
		int i = 11;

		System.out.println("카운트 다운을 시작합니다.");

		while (i-- != 0) {
			System.out.println(i);

			for (int j = 0; j < 2_000_000_000; j++) {
				;	// 아무런 내용도 없는 빈 문장
					// 매 출력마다 약간의 시간이 지연되도록 하기 위한 코드
			}
		}
		System.out.println("GAME OVER");
	}
}