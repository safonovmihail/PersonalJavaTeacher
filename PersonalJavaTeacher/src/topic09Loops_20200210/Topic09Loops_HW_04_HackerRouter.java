package topic09Loops_20200210;

import java.util.Scanner;

public class Topic09Loops_HW_04_HackerRouter {

	public static void main(String[] args) {
		int i, numRouters, code, count;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество роутеров: ");
		numRouters = in.nextInt();
		count = 0;
		for (i = 1; i < numRouters; i++) {
			System.out.print("Введите код уязвимости: ");
			code = in.nextInt();
			if (code == 171) {
				count++;
				break;
			}
		}
		in.close();
		if (count == 0) {
			System.out.println("Уязвимых роутеров не обнаружено");
		} else {
			System.out.println("Уязвимый роутер: " + i);
		}
	}
}
