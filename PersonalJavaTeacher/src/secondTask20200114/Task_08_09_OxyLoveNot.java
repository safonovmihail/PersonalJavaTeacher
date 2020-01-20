package secondTask20200114;

// 8.9. Оксана вычитала в астрологическом журнале очередной 
// способ гадания любит/не любит: нумерологический.
// Надо проверить время (часы, 0-24), на которое парень назначил ей свидание, 
// на чётность. Если результат будет нечётным, значит, не любит!
//
// Алгоритм проверки такой: надо просуммировать все натуральные делители числа, 
// исключив 1 и само число.
//
// Например, Олег назначил Оксане свидание в 6 утра. 6 делится нацело на 2 и на 3, 
// 2+3=5, нечётно -- не любит!

import java.util.Scanner;

public class Task_08_09_OxyLoveNot {

	public static void main(String[] args) {
		int i, hour, sum;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите время, на которое назначено свидание (в часах): ");
		hour = in.nextInt();
		in.close();

		sum = 0;
		for (i = 2; i < hour; i++) {
			if (hour % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum:" + sum);

		if (sum != 0 && sum % 2 == 0) {
			System.out.println("Любит");
		} else {
			System.out.println("Не любит");
		}
	}

}
