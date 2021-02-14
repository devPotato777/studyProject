package codeending.ch05;
/*
 * 커맨드 라인을 통해 입력받기
 * 화면을 통해 사용자로부터 값을 입력받을 수 있다.
 * 프로그램을 실행할 때 클래스 이름 뒤에 공백문자로 구분하여 여러 개의 문자열을 프로그램에 전달 할 수 있다.
 * 만일 실행할 프로그램의 main메스닥 담긴 클래스 이름이 MainTest라고 가졍하면 
 * c:\jdl1.8\work\ch5>java MainTest abc 123 이와 같이 실행할 수 있을 것이다. 
 * 커맨드라인을 통해 입력된 두 만졍을 String배열에 담겨서 MainTest클래스의 mian메서드의 매개변수(args)에 전달된다. 
 * 그리고는 main메서는 내에서 args[0], args[1]과 같은 방식으로 커맨드라인으로부터 전달받은 문자열에 접근할 수 있다. 
 * 여기서 args[0]은 abc이고 args[1]은 123이다.
 * 
 */
public class Ex16 {

	public static void main(String[] args) { 
		//run configurations를 통해 실행 그다음 Arguments탭에 원하는 내용 저장. 
		//그러면 문자열 배열로 메인메서드로 넘어간다.
		
		if(args!=null) {
			System.out.println("매개변수의 개수 : "+ args.length);
			for(int i=0; i<args.length;i++) {
				System.out.println("args["+i+"] = \""+args[i]+"\"");
			}
		}
	}

}

// alt + tab => 현재 경로를 알 수 있다. 
// class 파일은 bin폴더에 있다.