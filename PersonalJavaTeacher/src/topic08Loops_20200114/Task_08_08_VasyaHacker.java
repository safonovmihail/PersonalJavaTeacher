package topic08Loops_20200114;

import java.util.Scanner;

public class Task_08_08_VasyaHacker {

	public static void main(String[] args) {
		int n;
		System.out.println("Введите число: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();
		double log = Math.log(n) / Math.log(2);
		System.out.println("Степень числа 2: " + log);
		if (n % 2 == 0) {
			System.out.println("Служебное число");
		} else {
			System.out.println("Число не служебное");
		}
	}
}
