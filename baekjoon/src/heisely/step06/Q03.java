package heisely.step06;

import java.util.Scanner;

// 함수
// 1065. 한수
public class Q03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		equivalent_sequence(scan.nextInt()); // 함수 자체에서 출력문까지 설정해놨으므로 바로 수를 넣어주면 됨
		scan.close();
	}
	public static int equivalent_sequence(int num) {
		int cnt = 0;

		if (num < 100) { // num이 100미만이면 전부 등차수열을 이룬다. 따라서 num 그대로 출력
			System.out.println(num);
		} else { // 100~999인 세자리 수일경우
			cnt = 99; // 일단 기본적으로 99개는 갖고 있고,
			if (num >= 1000) { // 1000보다 커지게 되면 999로 조정해준다(왜냐하면 1000미만일때만 필요)
				num = 999;
			}
			for (int i = 100; i <= num; i++) { // 각 자리의 숫자를 저장
				int h = i/100;
				int t = (i/10)%10;
				int o = i%10;
				
				if((h-t)==(t-o)) { // 등차수열을 이루면 cnt를 1씩 증가시켜준다
					cnt++;
				}
			}
			System.out.println(cnt); // 반복이 끝나면 cnt 출력
		}
		return cnt;
	}
}
