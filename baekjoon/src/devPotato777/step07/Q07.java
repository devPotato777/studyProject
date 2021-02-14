package devPotato777.step07;

import java.util.Scanner;

/*
2908번
상수

문제
상근이의 동생 상수는 수학을 정말 못한다. 
상수는 숫자를 읽는데 문제가 있다. 
이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
상근이는 세 자리 수 두 개를 칠판에 써주었다. 
그 다음에 크기가 큰 수를 말해보라고 했다.

상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
예를 들어, 734와 893을 칠판에 적었다면, 
상수는 이 수를 437과 398로 읽는다.
따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

출력
첫째 줄에 상수의 대답을 출력한다.
 */

/**
 * 
 * @author ST_
 * 출처 : https://st-lab.tistory.com/66?category=838567
 * 
 * 먼저 StringBuilder 는 문자열을 다루는 클래스로 많이 쓰이고 있는데, 
 * 여기서 reverse() 라는 아주 좋은 메소드를 포함하고 있다.
 * 
 * 즉, 위를 사용하기 위해 먼저 StringBuilder 생성과 동시에 append() 라는 메소드에 값을 넣어준다.
 * 이때 append() 로 넣어진 값은 타입이 StringBuilder 라는 타입으로 변환된다.
 * 
 * 그리고 그렇게 저장된 수를 reverse() 라는 메소드를 통해 저장되어있던 문자열을 뒤집는다. 
 * 그리고 StringBuilder 타입을 문자열로 반환시키기 위해 toString() 을 써주면 끝이다.
 * 그리고 문자열로 반환시켰으니 Integer.parseInt() 로 String 을 int 로 타입을 변경시키면 끝이다.
 * 
 * 그렇게 뒤집힌 값은 출력에서 A 와 B 중 큰 값이 출력되도록 하면 끝난다.
 *
 */

public class Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

		System.out.print(A > B ? A : B);

		sc.close();

	} // main의 끝

}
