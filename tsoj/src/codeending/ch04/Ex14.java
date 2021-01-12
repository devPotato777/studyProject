package codeending.ch04;

public class Ex14 {

	public static void main(String[] args) {
		for(int i=1, j=10; i<=10;i++,j--)
			System.out.printf("%d \t %d%n", i, j);
		
		for(int i=1; i<=10; i++)
			System.out.printf("%d \t %d%n", i, 11-i);
		//둘 다 같지만 for문에 사용되는 변수의 수가 적은 것이 더 효율적이고 간단하므로 
		//불필요한 변수의 사용을 줄이는 것이 좋다.
	}

}
