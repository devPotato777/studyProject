package codeending.ch04;
/*
 * 이름 붙은 반복문
 * 
 * break문은 근접한 단 하나의 반복문만 벗어날 수 있기 때문에,
 * 여러 개의 반복문이 중첩된 경우에는 break문으로 중첩 반복문을 벗어날 수 없다.
 * 이때는 중첩 반복문을 앞에 이름을 붙이고 break문과 continue문에 이름을 저징해 줌으로써 
 * 하나 이상의 반복문을 벗어나거나 본복을 건너뛸 수 있다.
 */
public class Ex33 {

	public static void main(String[] args) {
		//for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==5) 
//						break Loop1;
//						break;
//						continue Loop1;
						continue;
					System.out.println(i+"*"+j+"="+i*j);
				} // end of for i
				System.out.println();
		} // end of Loop1
	}

}

//break Loop1은 Loop1반복문을 완전히 벗어남.

//break문은 for(j)를 벗어나 System.out.println();까지 완료하고 다시 Loop1반복문을 실행함
	
//continue Loop1;은 바로 Loop1반복문 끝을 실행함. 그렇기때문에 System.out.println();은 실행되지 않음.
	
//continue문은 i==5일 경우를 제외하고 전부 실행한다. 
//*continue는 반복문 전체를 벗어나지 반복문 끝으로 이동하여 다음 반복으로 넘어간다.*
