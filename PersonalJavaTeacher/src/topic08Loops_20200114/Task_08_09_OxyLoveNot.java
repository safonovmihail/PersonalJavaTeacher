package topic08Loops_20200114;

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
		if (sum != 0 && sum % 2 == 0) {
			System.out.println("Любит");
		} else {
			System.out.println("Не любит");
		}
	}
}
