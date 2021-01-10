package heisely.ch03;

// OperatorEx3
public class Ex03 {
	public static void main(String[] args) {
		int i = 5, j = 5;
		System.out.println(i++); // i=5를 먼저 출력하고 i++진행(i=6)
		System.out.println(++j); // j++을 먼저 진행하고(j=6) 출력
		System.out.println("i = " + i + ", j = " + j); // 위에서 이미 i++이 진행됐으므로 i=6,j=6 출력
	}
}
