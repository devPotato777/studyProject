package scento03.ch03;

public class Ex08 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		
		long c = a * b;
		
		System.out.println(c);
		
		c = (long) a * b;
		
		System.out.println(c);
	
	}

}
