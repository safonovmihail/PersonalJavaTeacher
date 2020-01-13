package firstTasks202001;

import java.util.Scanner;

public class Task_07_02_CompareNums {

	public static void main(String[] args) {
		float num1;
		float num2;

		Scanner in = new Scanner(System.in);
		System.out.print("введите первое вещественное число: ");
		num1 = in.nextFloat();
		System.out.print("введите второе вещественное число: ");
		num2 = in.nextFloat();
		in.close();
//не понял, зачем приводить к инту?
		if (num1 * 1000 / 1000 == num2 * 1000 / 1000) {
			System.out.println("Числа совпадают до третьего знака");
		} else {
			System.out.println("Числа не совпадают до третьего знака");
		}
	}
}
