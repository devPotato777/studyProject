package scento03.ch06;

//ConstructorTest
class Data1 {
	int value;
}

class Data2 {
	int value;

	Data2(int x) {
		value = x;
	}
}

public class Ex23 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2();	// compile error발생
		Data2 d2 = new Data2(10);
	}

}
