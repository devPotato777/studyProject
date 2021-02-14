package devPotato777.ch06;


//Ex09에 선언되어 있으므로 주석처리
//class Data {
//	int x;
//}

// p.268 참조형 반환타입
public class Ex14 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;

		Data d2 = copy(d);
		System.out.println("d.x =" + d.x);
		System.out.println("d2.x =" + d2.x);

	}

	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;

		return tmp;
	}

}
