package devPotato777.ch05;

// char배열과 String클래스
// String클래스는 char배열에 기능 (메서드)을 추가한 것이다.
public class Ex13 {

	public static void main(String[] args) {
		char[] hex = { 'C', 'A', 'F', 'E' };
		
		String[] binary = { "0000", "0001", "0010", "0011"
						  , "0100", "0101", "0110", "0111"
						  , "1000", "1001", "1010", "1011"
						  , "1100", "1101", "1110", "1111" };
		
		String result = "";
		
		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') {
				result += binary[hex[i] - '0']; // '8' - '0' 의 결과는 8이다.
			} else {
				result += binary[hex[i] - 'A' + 10]; // 'C' - 'A' 의 결과는 2
			}
		} // end for
									   // String(char[] value)
		System.out.println("hex : " + new String(hex));
		System.out.println("binary : " + result);

	}

}
