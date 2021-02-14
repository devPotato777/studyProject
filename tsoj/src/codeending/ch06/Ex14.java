package codeending.ch06;
/*
 * 1.copy메서드를 호출하면서 참조변수 d의 값이 매개변수 d에 복산된다.
 * 2.새로운 객체를 생성한 다음, d.x에 저장된 값을 tmp.x세 복사한다.
 * 3.copy메서드가 종료되면서 반환한 tmp의 값은 참조변수 d2에 저장된다.
 * 4.copy메서드가 종료되어 tmp가 사라졌지만, d2의 재로운 객체르르 다룰 수 있다.
 * 
 * 반환타입이 참조형이라는 것은
 * 메서드가 객체의 주소를 반환한다는 것을 의미한다.
 */
public class Ex14 {
	static class Data{ int x;}
	
	static class ReferenceReturnEx{
		public static void main(String[] args) {
			Data d = new Data();
			d.x = 10;
			
			Data d2 = copy(d);
			System.out.println("d.x = "+ d.x);
			System.out.println("d2.x = "+d2.x);
		}
		
		static Data copy(Data d) {
			Data tmp = new Data(); //새로운 객체 tmp를 생성한다.
			tmp.x = d.x; //d.x의 값을 tmp.x에 복사한다.
			
			return tmp; //복사한 객체의 주소를 반환한다.
		}
	} //class ReferenceReturnEx의 끝
}// class Ex14의 끝
