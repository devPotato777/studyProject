package heisely.ch06;

// TvTest3
// Ex01에서 정의한 Tv class 사용
public class Ex03 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");
		
		t2 = t1; // t1의 주소값을 t2에 저장
		t1.channel = 7; // t1의 channel값을 7로 변경 // t1의 주소값을 t2에 저장했기때문에 t2의 채널도 변경된다.
		System.out.println("t1의 channel값을 7로 변경했습니다.");
		
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");
	}
}
