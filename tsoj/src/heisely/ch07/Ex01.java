package heisely.ch07;

// Inheritance(상속)
// CaptionTvTest.
class Tv {
	boolean power; // 전원 상태(on/off)
	int channel; // 채널
	
	void power() {power=!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv {
	boolean caption; // 캡션 상태(on/off)
	void displayCaption(String text) {
		if(caption) { // 캡션상태가 on(true)일 때만 text 출력
			System.out.println(text);
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; // 부모클래스로부터 상속받은 멤버
		ctv.channelUp(); // 부모클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World"); // 출력 안 됨
		ctv.caption = true; // 캡션(자막) 기능을 킴
		ctv.displayCaption("Hello, World"); // 출력 됨
	}
}
