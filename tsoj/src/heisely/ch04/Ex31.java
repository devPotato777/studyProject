package heisely.ch04;

// FlowEx31. continue문(1)
public class Ex31 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0)
				continue; // i를 3으로 나눈 값이 0이면 하단 내용을 실행하지 않고 다시 반복한다. break문과 달리 반복문을 벗어나지 않는다.
			System.out.println(i); // 0,3,6,9는 출력되지 않는다.
		}
	}
}
