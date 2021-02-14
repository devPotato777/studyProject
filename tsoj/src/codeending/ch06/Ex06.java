package codeending.ch06;
/*
 * 메서드
 * 메서드(method)는 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
 * 
 * 메서드를 사용하는 이유
 * 1. 높은 재사용성(reusability)
 * 2. 중복된 코드의 제거
 * 		전체 소스 코드의 길이도 짧아지고, 
 * 		변경사항이 발생했을 때
 * 		수정해야할 코드의 양이 줄어들어 
 * 		오류가 발생할 가능성도 함께 줄어든다.
 * 3.프로그램의 구조화
 * 
 * 메서드의 선언과 구현
 * 메서드느 크게 두 부분, 선언부(header, 머리)와 구현부(body, 몸통)로 이루어져 있다.
 * 
 * 메서드 선언부(method declaration, method header)
 * 메서드의 이름과 매개변수의 선언, 그리고 반환타입으로 구성
 * 
 * 매개변수선언(parameter declaration)
 * 작업을 수행하는데 필요한 값들을 제공받기 위한 것
 * 메서드의 이름(method name)
 * 반환타입(return type)
 * 메서드의 작업수행 결과인 반환값(return value)의 타입을 적는다. 반환값이 없는 경우 void를 적어야한다.
 * 
 * 메서드의 구현부(method body, 메서드 몸통)
 * 메서드의 선언부 다음에 오는 괄호{}를 메소드의 구현부라고 하는데, 여기서 메서드를 호출했을때 수행될 문장들을 넣는다.
 * 
 * return문
 * 이 값의 타입은 반환타입과 일치하거나 적어도 자동 형변환이 가능한 것이여야한다.
 * retuern문은 단 하나의 값만 반환할 수 있다.
 * 
 * 지역변수(local variable)
 * 메서드 내에 선언된 변수들은 그 메서드 내에서만 사용할 수 있다.
 * 
 * 메서드의 호출
 * 메서드를 호출해야만 구현부{}의 문장들이 수행된다. 
 * 호출방법 >> 메서드이름(값1, 값2, ...);
 * 
 * 인자(argument)와 매개변수(parameter)
 * 메서드를 호춣라 때 괄호()안에 지정해둔 값들을 인자(argument) 또는 인수라고 한다.
 * 인자의 개수와 순서는 호출된 메서드에 선언된 매개변수와 일치해야 한다.
 * 
 * return문
 * return문은 현재 실행중인 메서드를 종료하고 호출한 메서드로 되돌아간다.
 * void는 컴파일러가 마지막에 return;을 자동적으로 추가하기때문에 return문이 없어도 문제가 없다.
 * void문을 제외하고 반드시 return문이 있어야한다.
 * return문은 조건이 참일때만 실행되기 때문에 if~else를 통해 항상 결과값이 반환되도록 해야한다.
 * 
 * 매개변수의 유효성 검사 
 * 타입만 맞으면 어떤 값도 매개변수를 통해 넘어올 수 있기 때문에,
 * 가능한 모든 경우의 수에 대해 고민하고 그에 대비한 코드를 작성해야한다.
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); //인스턴스 생성
		long result1 = mm.add(5L, 3L); //메서드 호출
		long result2 = mm.subtract(5L, 3L); //메서드 호출
		long result3 = mm.multiply(5L, 3L); //메서드 호출
		double result4 = mm.divide(5L, 3L); //메서드 호출 double 대신 long값으로 호출,이 값은 double로 자동형변환
		
		System.out.println("add(5L, 3L) =" + result1);
		System.out.println("subtract(5L, 3L) =" + result2);
		System.out.println("multiply(5L, 3L) =" + result3);
		System.out.println("divide(5L, 3L) =" + result4);
		
	}

}
