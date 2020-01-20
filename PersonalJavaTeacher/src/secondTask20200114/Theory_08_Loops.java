package secondTask20200114;

public class Theory_08_Loops {

	public static void main(String[] args) {
		int i, sum;

		System.out.println("for sum");

		sum = 0;
		for (i = 1; i <= 10; i = i + 1) {
			System.out.println(sum);
			sum = sum + i;
			System.out.println(sum);
		}

		System.out.println("for sum1");

		sum = 0;
		for (i = 1; i <= 10; i = i + 1) {
			System.out.println(sum);
			sum = sum + i;
		}
//			System.out.println(sum1);

		System.out.println("for sum2");

		sum = 0;
		for (i = -25; i > -100; i = i - 15)
//счетчик может меняться произвольно
//		{
		System.out.println(sum);
		System.out.println(i);
		sum = sum * i;
		System.out.println(i);
		System.out.println(sum);

//		}
		System.out.println(sum);

		System.out.println("for sum3");

		sum = 0;
		for (i = -25; i > -100; i = i - 15) {
			sum = sum - i;
			if (i > -50)
				System.out.println("> -50 !");
// почему вывод в консоли дважды?
		}
		sum = 0;
		for (i = 1; i <= 10;) {
			sum = sum + i;
			i = i + 1;
//			System.out.println(sum);
//			System.out.println(i);
		}
//			System.out.println(sum);
//			System.out.println(i);
	}
}

//не могу понять, почему разный вывод программы при печати до sum и после
//как организовать вывод результата каждой итерации цикла?
