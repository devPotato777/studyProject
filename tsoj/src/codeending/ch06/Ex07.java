package codeending.ch06;
/*
 * JVM의 메모리 구조
 * 1.메서드 영역(method area)
 * 프로그램 실행 중 어떤 클래스가 사용되면, JVM은 해당 클래스의 클래스파일(*.class)을 읽어서 분석하여
 * 클래스에 대한 정보(클래스 데이터)를 이곳에 저장한다.
 * 
 * 2.힙(Heap)
 * 인스턴스가 생성되는 공간, 프로그램 실행 중 생성되는 인스턴스는 모두 이곳에 생성된다.
 * 
 * 3.호툴스택(call stack 또는 execution stack)
 * 호출스택은 메서드의 작업에 필요한 메모리 공간을 제공한다.
 * 메서드가 호출되면, 호출스택에 호출된 메서드를 위한 메모리가 할당되며,
 * 이 메모리는 메서드가 작업을 수행하는 동안 지역변수(매개변수 포함)들과 연산의 중간결과 등을 저장하는데 사용된다.
 * 그리고 메서드가 작업을 마치면 할당되었던 메모리고간은 반환되어 비워진다.
 * 
 * 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.
 * 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다.
 * 호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드다.
 * 아래에 있는 메서드가 바로 위에 메서드를 호출한 메서드다.
 */
public class Ex07 {

	public static void main(String[] args) {
		firstMethod(); //static메서드는 객체 생성없이 호출가능하다.
	}
	
	static void firstMethod() {
		secondMethod();
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
	
}
