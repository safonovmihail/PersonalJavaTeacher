package secondTask20200114;

import java.util.Scanner;

public class Task_08_08_VasyaHacker_02 {

	public static void main(String[] args) {
		int n, i;

		System.out.println("Введите число: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();

		for (i = 2; (i < n); i = 2 * i) {
		}
		if (i == n) {
			System.out.println("Число служебное");
		} else {
			System.out.println("Число не служебное");
		}
	}
}
