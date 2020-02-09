package secondTask20200114;

//переписанный оператор цикла

public class Theory_08_Loops_04 {

	public static void main(String[] args) {
		int i, sum;
		sum = 0;
		for (i = 1; i <= 10;) {
			sum = sum + i;
			i = i + 1;
//			System.out.println();
			System.out.println("i in FOR: " + i);
			System.out.println("sum in FOR: " + sum);
		}
		System.out.println();
		System.out.println("sum(final): " + sum);
	}
}
