package heisely.step08;

import java.util.Scanner;

// 2869. 달팽이는 올라가고 싶다.
public class Q03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int v = scan.nextInt();
		int m = (v-b)/(a-b);
		scan.close();
		
		if((v-b)%(a-b)!=0) { // 나머지가 있다면,
			System.out.println(m+1); // 하루가 더 걸린다.
		} else { // 나머지가 없다면,
			System.out.println(m); // 그 날로 끝!
		}
	}
}
