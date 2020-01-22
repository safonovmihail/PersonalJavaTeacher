package secondTask20200114;

import java.util.Scanner;

public class Task_08_11_Factorial {

	public static void main(String[] args) {
		int i, n, factorial;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число: ");
		n = in.nextInt();
		in.close();
		factorial = 1;
		for (i = 2; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
