package heisely.ch02;

// VarEx1
public class Ex01 {
	public static void main(String[] args) {
		int year = 0; // 변수 선언 및 초기화
		int age = 14;

		System.out.println(year); // year에 저장된 값 0 출력
		System.out.println(age); // age에 저장된 값 14 출력

		year = age + 2000; // 변수 age의 값에 2000을 더해서 변수 year에 저장
		age = age + 1; // 변수 age에 저장된 값을 1 증가 시킴

		System.out.println(year); // year에 새로 저장된 값 2014 출력
		System.out.println(age); // age에 새로 저장된 값 15 출력
	}
}
