package heisely.ch03;

// OperatorEx22
public class Ex22 {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double) f;

		System.out.printf("10.0==10.0f	%b\n", 10.0 == 10.0f);
		System.out.printf("0.1==0.1f	%b\n", 0.1 == 0.1f);
		System.out.printf("f =%19.17f\n", f);
		System.out.printf("d =%19.17f\n", d);
		System.out.printf("d2 =%19.17f\n", d2);
		System.out.printf("d==f	%b\n", d == f);
		System.out.printf("d==d2	%b\n", d == d2);
		System.out.printf("d2==f	%b\n", d2 == f);
		System.out.printf("(float)d==f	%b\n", (float) d == f);
	}
}
/*
 10.0==0.0f : true
 0.1==0.1f : false
 >> 정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생.
 >> 10.0f는 오차없이 저장할 수 있는 값이어서 double로 형변환해도 그대로 10.0이지만,
 	0.1f는 저장할 때 2진수로 변환하는 과정에서 오차가 발생한다.
 	double타입의 상수인 0.1도 저장되는 과정에서 오차가 발생하지만, 0.1f보다는 적은 오차로 저장된다.
 */
