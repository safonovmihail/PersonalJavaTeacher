package firstTasks202001;

import java.util.Scanner;

public class Task_07_04_EvenNumber {

	// определение четности числа

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число: ");
		num = in.nextInt();
		in.close();
		if (num % 2 == 0) {
			System.out.println("четное");
		} else {
			System.out.println("нечетное");
		}

	}

}
