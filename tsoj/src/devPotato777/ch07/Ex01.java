package devPotato777.ch07;

// Ex04에 작성되었으므로 주석처리
/*
class Tv{
	boolean power;	// 전원상태 (on/off)
	int channel;	// 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
*/

class CaptionTv extends Tv {
	boolean caption; // 캡션상태 (on/off)

	void displayCaption(String text) {
		if (caption) { // 캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

// p.315 CaptionTvTest
public class Ex01 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true; // 캡션(자막) 기능을 켠다.
		ctv.displayCaption("Hello, World");

	}

}
