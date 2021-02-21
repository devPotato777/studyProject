package heisely.ch07;

/*
# 접근 제어자
0. 접근 제어자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자
1. private: 같은 클래스 내에서만 접근 가능
2. default: 같은 패키지 내에서만 접근 가능 >> 클래스나 멤버변수, 메서드, 생성자에 접근제어자가 지정되어있지 않다면 default를 뜻함
3. protected: 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근 가능
4. public: 접근 제한 없음!

# 접근제어자 사용 이유
	> 외부로부터 데이터 보호
	> 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위함
 */
// TimeTest.
class Time {
	private int hour, minute, second;

	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}

public class Ex13 {
	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
//		t.hour = 13; // Error! 변수 hour의 접근제어자가 private이므로 접근할 수 없다.
		t.setHour(t.getHour()+1); // 현재 시간보다 1시간 후로 변경
		System.out.println(t); // Stytem.out.println(t.toString());
	}
}
