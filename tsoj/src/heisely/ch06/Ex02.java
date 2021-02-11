package heisely.ch06;

// TvTest2
// Ex01에서 정의한 Tv class 사용
public class Ex02 {
	public static void main(String[] args) {
		Tv t1 = new Tv(); // Tv t1; t1 = new Tv();를 한문장으로 처리
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");
		
		t1.channel = 7; // t1의 channel값을 7로 설정
		System.out.println("t1의 channel값을 7로 변경했습니다.");
		
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");
	}
}
