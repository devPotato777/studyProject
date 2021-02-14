package codeending.ch06;
/*
 * 인스턴스변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만,
 * 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.
 * 
 * 클래스변수 사용 >> 클래스이름.클래스변수 
 * 인스턴스변수와의 혼동을 막음
 */
public class Ex05 {

	public static void main(String[] args) {
		System.out.println("Card.widhth = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;  //인스턴스변수의 값 변경
		
		System.out.println("c1은 "+ c1.kind + " , "+ c1.number +"이며, 크기는 ( "+ c1.width+", "+c1.height+ " )");
		System.out.println("c2은 "+ c2.kind + " , "+ c2.number +"이며, 크기는 ( "+ c2.width+", "+c2.height+ " )");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80; // 클래스변수의 값 변경
		

		System.out.println("c1은 "+ c1.kind + " , "+ c1.number +"이며, 크기는 ( "+ c1.width+", "+c1.height+ " )");
		System.out.println("c2은 "+ c2.kind + " , "+ c2.number +"이며, 크기는 ( "+ c2.width+", "+c2.height+ " )");
		
		
	}

}

