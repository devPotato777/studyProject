package codeending.ch06;
/*
 * Tv클래스의 인스턴스 t1과 t2를 생성한 후에, 인스턴스 t1의 멤버변수인 channel의 값을 변경
 * 같은 클래스로부터 생성되었을지라도 각 인스턴스의 속성(멤버변수)은 서로 다른 값을 유지
 * 메서드느이 내용은 모든 인스턴스에 대해 동일하다.
 */
public class Ex02 {

	public static void main(String[] args) {
		Tv t1 = new Tv() ;		//Tv t1; t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv() ;
		System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");
		
		t1.channel = 7; //channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
	}

}
