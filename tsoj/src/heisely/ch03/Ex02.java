package heisely.ch03;

//OperatorEx2
public class Ex02 {
	public static void main(String[] args) {
		int i = 5, j = 0;

		j = i++; // j에 i값을 넣고(j=5), i++ 진행(i=6)
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);

		i = 5;
		j = 0; // 결과 비교를 위해 j와 j의 값을 다시 5와 0으로 변경

		j = ++i; // ++i를 먼저 하고(i=6) j에 대입(j=6)
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
	}
}
