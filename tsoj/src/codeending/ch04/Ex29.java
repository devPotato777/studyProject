package codeending.ch04;
/*
 * do-while문
 */
public class Ex29 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			System.out.printf("i=%d ", i);
			
			int tmp =i; //변수 i는 for문 제어에 쓰이므로 다른 변수에 저장해서 처리
			
			do {
				//tmp%10이 3의 배수인지 확인(0 제외)
				if(tmp%10%3==0 && tmp%10!=0)
					System.out.print("짝");
			  //tmp /= 10은 tmp = tmp / 10과 동일
			}while((tmp/=10)!=0);
			
			System.out.println();
		}
	} //main

}
