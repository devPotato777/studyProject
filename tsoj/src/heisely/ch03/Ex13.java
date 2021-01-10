package heisely.ch03;
//OperatorEx13
public class Ex13 {
	public static void main(String[] args) {
		char c1 = 'a';
//		char c2 = c1+1; // 컴파일 에러 발생 >> char 과 int의 계산이기 때문
		char c3 = 'a'+1; // 'a'는 리터럴이므로 리터럴과 리터럴 간 계산이 돼서 에러 없음
		System.out.println(c3);
	}
}
