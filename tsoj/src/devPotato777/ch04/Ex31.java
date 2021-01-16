package devPotato777.ch04;

/*
 * continue문
 * 반복문 내에서만 사용될 수 있다.
 * 반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
 * for문의 경우 증감식으로 이동하고,
 * while문과 do-while문은 조건식으로 이동한다.
 * 
 * 반복문 전체를 벗어나지 않고 다음 반복을 계속 수행한다는 점이 break문과 다르다.
 * 
 * 주로 if문과 함께 사용되어 특정 조건을 만족하는 경우에
 * continue문 이후의 문장들을 수행하지 않고 다음 반복으로 넘어가서 계속 진행하도록 한다.
 * 
 * 전체 반복 중에 특정조건을 만족하는 경우를 제외하고자 할 때 유용하다.
 */

public class Ex31 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println(i);
		}
	}
}