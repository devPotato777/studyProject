package heisely.ch05;

// 2. String배열
// ArrayEx16 - command라인을 통해 입력받기 >> cmd창이나 Arguments 입력으로 출력
public class Ex16 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수: " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]: \"" + args[i]+"\"");
		}
	}
}
