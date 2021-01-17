package codeending.ch04;
/*
 * break문
 * 
 * 조건식 말고도 반복문에서도 사용 가능
 * break문은 자신이 포함된 가장 가까운 반복문을 벗어난다.
 * 주로 if문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어나도록 한다.
 */
public class Ex30 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			
			++i;	//break문이 수행되면 여기서부터 실행되지 않고 while문을 완전히 벗어남.
			sum += i; //-> 두 문장을 sum += ++i로 줄일 수 있다. 
		} //end of while
		System.out.println("i=" + i);
		System.out.println("sum="+sum);
	}

}
