package secondTask20200114;

import java.util.Scanner;

public class Task_08_07_OlympPuchHoneyPot {

	public static void main(String[] args) {
		int x, y, sum, i;
		Scanner in = new Scanner(System.in);
		System.out.print("Объем горшочка (в горстях): ");
		x = in.nextInt();
		System.out.print("Количство выедаемых горстей: ");
		y = in.nextInt();
		in.close();
		sum = 0;
		for (i = 1; x - y * (i - 1) > 0; i++) {
			sum = sum + x - y * (i - 1);
		}
		System.out.println("горшков: " + (float)sum/(float)x);
		System.out.println("дней: " + (i-1));
	}
}