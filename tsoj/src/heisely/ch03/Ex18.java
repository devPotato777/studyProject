package heisely.ch03;

// OperatorEx18
public class Ex18 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; // round(): 매개변수로 받은 값을 소수점 첫쨰자리에서 반올림 후 정수반환
		System.out.println(shortPi);
		// Math.round(pi*1000)/1000 = Math.round(3141.592)/1000 = 3142/1000 = 3.142
	}
}
