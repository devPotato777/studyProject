package devPotato777.step08;

import java.util.Scanner;

/*
2292번
벌집

문제
위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 
그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

입력
첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.

출력
입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
 */

/*
 *1 ~ 1 = 1
 *1 ~ 2 = 2칸
 *
 *2 ~ 7 = 6
 *1 ~ 7 = 2칸
 *
 *8 ~ 19 = 12
 *1 ~ 19 = 3칸
 *
 *20 ~ 37 = 18
 *1 ~ 37 = 4칸
 *
 *38 ~ 61 = 24 
 *
 */

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int A = 2;
		int B = 7;
		int cnt = 2;

		for (;;) {
			if (num == 1) {
				cnt = 1;
				break;
			}
			if (A <= num && B >= num)
				break;
			else {
				A = A + (6 * (cnt - 1));
				B = B + (6 * cnt);
				cnt++;
			}

		}

		System.out.println(cnt);
	}

}

//public class Q02 {
//	public static void main(String[] args) {
//	      Scanner scan = new Scanner(System.in);
//	      int a = scan.nextInt();
//	      int n = 1; // 껍질 번호 (1을 둘러싸고 있는 것부터 첫 번째 껍질이라고 가정)
//
//	      if (a == 1) {
//	         System.out.println(a);
//	      } else {
//	         while (true) {
//	            if (3*n*(n-1)+2 <= a && a <= 3*n*(n+1)+1) { // 규칙 맨 앞 숫자와 맨 뒤 숫자가 계차수열을 이룸 (n>=1)
//	               // 입력한 수가 이 사이에 있으면 껍질 번호 +1 출력
//	               System.out.println(n+1); // 1을 포함해서 통과하는 횟수를 생각하기 때문에 +1 해서 출력
//	               break; // 반복문을 벗어난다.
//	            }         
//	            n++; // 조건에 맞지 않으면 껍질 번호 증가
//	         }
//	      }
//	   }
//}