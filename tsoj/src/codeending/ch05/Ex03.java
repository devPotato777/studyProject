package codeending.ch05;
/*
 * 배열의 복사
 * 배열은 한번 생성하면 그 길이를 변경할 수 없기 때무에 더 많은 저장공간이 
 * 필요하다면 보다 큰 배열을 새로 만들고 이전 배열로부터 내용을 복사해야한다.
 * 방법은 두가지가 있다.
 * 첫번째 for문을 이용해서 배열을 복사하는 방법
 * int[] arr = new int[5];
 * int[] tmp = new int[arr.length*2]; //기존 배열보다 길이가 2배인 배열 생성
 * for(int i=0; i<arr.length;i++)
 * 		tmp[i] = arr[i]; // arr[i]의 값을 tmp[i]에 저장
 * arr = tmp; //참조변수 arr이 새로운 배열을 가리키게 된다.
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		//배열 arr에 1~5를 저장한다.
		for(int i=0; i<arr.length; i++) 
			arr[i] = i+1;
		
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];
		
		//배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for(int i=0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp; // tmp에 저장된 값을 arr에 저장한다.
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);		
	}

}
