package heisely.ch06;

// DocumentTest.
class Document {
	static int count = 0;
	String name; // 문서명(Document name)

	// 매개변수가 없는 생성자.
	Document() { // 문서 생성 시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count); // count를 하나씩 증가해서 제목없음 옆에 붙임.
	}

	// 매개변수가 있는 생성자
	Document(String name) { // 문서명 지정 시
		this.name = name; // 지정한 문서명을 받아서 String name에 저장
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

public class Ex30 {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
}
