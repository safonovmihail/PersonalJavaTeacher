package topic08Loops_20200114;

// иллюстрация: группа операторов в теле цикла

public class Theory_08_Loops_03 {

	public static void main(String[] args) {
		int i, sum;
		sum = 0;
		for (i = -25; i > -100; i = i - 15) {
			System.out.println("i: " + i);
			System.out.println("sum: " + sum);
			sum = sum - i;
			System.out.println("sum - i: " + sum);
			if (i > -50) {
				System.out.println("> -50 !");
				if (i > -40)
					System.out.println("> -40 !");
			}
			System.out.println();
			System.out.println("sum(in for): " + sum);
			System.out.println();
		}
		System.out.println("sum(final): " + sum);
	}
}
