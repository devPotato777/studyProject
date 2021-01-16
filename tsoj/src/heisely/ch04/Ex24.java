package heisely.ch04;

// FlowEx24. while문(2)
public class Ex24 {
	public static void main(String[] args) {
		int i = 11;

		System.out.println("카운트 다운을 시작합니다.");

		while (i-- != 0) {
			System.out.println(i); // 10부터 0까지 1씩 감소시키면서 출력을 하되,

			for (long j = 0; j < 3_000_000_000L; j++) { // 매 출력마다 약간의 시간이 지연되도록 함
				;
				// for(int j=0; j<2_000_000_000; j++); 과 같은 문장
				// 컴퓨터 성능에 따라 지연되는 시간이 다르므로 지연시간은 반복횟수를 적절히 조절
			}
		}
		System.out.println("GAME OVER");
	}
}
