package secondTask20200114;

import java.util.Scanner;

// 8.4. Напишите программу, которая будет вычислять сумму 
// только нечётных из первых N целых чисел, начиная с 0.

public class Task_08_04_SumOddNums {

	public static void main(String[] args) {
		int i, n, sum;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число [n]: ");
		n = in.nextInt();
		in.close();
		sum = 0;
		for (i = 1; i < n;) {
			sum = sum + i;
			System.out.println("нечетные числа: " + i);
			System.out.println("промежуточная сумма: " + sum);
			i = i + 2;
		}
		System.out.println();
		System.out.println("сумма:" + sum);
	}

}
