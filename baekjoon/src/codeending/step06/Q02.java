package codeending.step06;

public class Q02 {

	public static void main(String[] args) {
		N4673();
	}
	public static void N4673() {
		
		int[] arr = { 1, 3, 5, 7, 9};
		int num = 1;
		for(int i =0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		do {
			
			num += 9+11 ;
			System.out.println(num);
		}while(num < 10000);
	}
	
	public static void other() {
		boolean[] check = new boolean[10001];	// 1부터 10000이므로
		 
		for (int i = 1; i < 100001; i++){
			int n = d(i);
			
			if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
				check[n] = true;
			}
		}
	}
	 
	public static int d(int number){
		int sum = number;
	    
		while(number != 0){
			sum = sum + (number % 10); // 첫 째 자리수
			number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
	    
		return sum;
	}
}
