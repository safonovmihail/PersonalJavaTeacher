package secondTask20200114;

import java.util.Scanner;

public class Task_08_07_OlympPuchHoneyPot {

	public static void main(String[] args) {

		int x1, x2, i, sum, consist;
		sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите емкость горшочка в горстях: ");
		x1 = in.nextInt();
		System.out.println("Введите количество выедаемых горстей за один раз: ");
		x2 = in.nextInt();
		in.close();
		sum = 0;
		for (i = 1; (x1 - i * x2) >= 0; i++) {
			consist = (x1 - (i - 1) * x2);
			sum = sum + consist;
		}
		System.out.println();
		System.out.println("Всего дней: " + (i - 1));
		System.out.println("Всего собрано меда (в горстях): " + sum);
		System.out.println("Всего собрано меда (в горшочках): " + (float) sum / (float) x1);
	}
}
