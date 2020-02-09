package secondTask20200114;

import java.util.Scanner;
public class Task_08_01_SumFirstN {
	public static void main(String[] args) {
		int i, sum, n;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число [n]: ");
		n = in.nextInt();
		in.close();
		sum = 0;
		for (i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Сумма всех чисел для [n] равна: " + sum );
	}
}
