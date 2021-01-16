package heisely.ch04;

// FlowEx33. 이름 붙은 반복문(1)
public class Ex33 {
	public static void main(String[] args) {
		// for문에 Loop1 이라는 이름 붙이기
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					break Loop1; // Loop1을 벗어남 >> 2*4까지만 출력
//					break; // j의 for문만 벗어남 >> 각 단의 *4까지만 출력
//					continue Loop1; // break;와 같지만, Loop1의 처음으로 돌아가므로 System.out.println();은 실행되지 않는다.
//					continue; // j=5일 때만 빼고 모든 구구단 출력 (각 단의 *5만 제외)
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}
}
