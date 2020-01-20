package secondTask20200114;

public class Theory_08_Loops_01 {

	public static void main(String[] args) {
		int i, sum;
		sum = 0;
		for (i = 1; i <= 10; i = i + 1)
			sum = sum + i;
		System.out.println(i);
		System.out.println(sum);

		sum = 0;
		for (i = 1; i <= 10; i = i + 1) {
			System.out.println();
			System.out.println("i(before sum + i) = " + i);
			System.out.println("sum(before sum + i) = " + sum);
			sum = sum + i;
			System.out.println("i = " + i);
			System.out.println("sum = " + sum);
		}
		System.out.println(i);
		System.out.println(sum);
	}
}
