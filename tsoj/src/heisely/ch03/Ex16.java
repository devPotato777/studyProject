package heisely.ch03;

// OperatorEx16
public class Ex16 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f;
		// (int) (pi * 1000) / 1000f = (int)(3141.592) / 1000f
		//							 = 3141 / 1000f
		//							 = 3.141 (float 형으로 바뀌므로 소수점 표현 가능)
		System.out.println(shortPi);
	}
}
