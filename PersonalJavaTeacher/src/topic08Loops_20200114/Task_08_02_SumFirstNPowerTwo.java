package topic08Loops_20200114;

import java.util.Scanner;

public class Task_08_02_SumFirstNPowerTwo {

	public static void main(String[] args) {
		int i, sum, n;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число [n]: ");
		n = in.nextInt();
		in.close();
		sum = 0;
		for (i = 1; i <= n; i++) {
			sum = sum + i*i;
		}
		System.out.println("Сумма квадратов всех чисел для [n] равна: " + sum);
	}
}
