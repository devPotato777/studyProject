package heisely.ch07;

// TVCR - 단일 상속
/*
Ex01의 class Tv 사용
class Tv {
	boolean power; // 전원 상태(on/off)
	int channel; // 채널
	
	void power() {power=!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}*/
class VCR {
	boolean power;
	int counter = 0;

	void power() {power = !power;}

	void play() {}

	void stop() {}

	void rew() {}

	void ff() {}
}

public class Ex04 extends Tv {
	VCR vcr = new VCR(); // VCR클래스를 포함시켜서 사용

	void play() {
		vcr.play();
	}

	void stop() {
		vcr.stop();
	}

	void rew() {
		vcr.rew();
	}

	void ff() {
		vcr.ff();
	}
}
