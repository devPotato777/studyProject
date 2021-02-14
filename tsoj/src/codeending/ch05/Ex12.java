package codeending.ch05;
/*
 * String 배열 (p206)
 * 
 * String배열의 선언과 생성 
 * String[] name = new String[3]; //3개의 문자열을 담을 수 있는 배열을 생성한다. 
 * 3개의 String타입의 참조변수를 저장하기 위한 공간이 마련되고
 * 참조형 변수의 기본값은 null이므로 각 요소의 값의 값은 null로 초기화 된다.
 * null은 어떠한 객체도 가르키고 있지 않다는 뜻이다.
 * 
 * String배열의 초기화 
 * 배열 각 요소에 문자열을 지정하면된다.
 * String name = new string[3];
 * name[0] = "Kim";
 * name[1] = "Park";
 * name[2] = "Yi";
 *     or
 * String[] name = new String[]{"Kim", "Park", "Yi"};
 * String[] name = {"Kim", "Park", "Yi"}; // new String[]을 생략할 수 있음
 * 하지만 원래는 String은 클래스이므로 아래 처럼 new연산자를 통해 객체를 생성해야함.
 * name[0] = new String("Kim");
 * 
 */
public class Ex12 {

	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"};
		
		for(int i=0; i<names.length; i++)
			System.out.println("names["+i+"] : "+names[i]);
		
		String tmp = names[2]; // 배열 names의 세 번째 요소를 tmp에 저장
		System.out.println("tmp : "+tmp);
		names[0] = "Yu"; //배열 names의 첫 번째 요소를 "Yu"로 변경
		
		for(String str : names) //향상된 for문
			System.out.println(str);
	}// main의 끝

}
