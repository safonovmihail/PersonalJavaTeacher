package secondTask20200114;

import java.util.Scanner;

public class Task_08_10_OxyPlants {

	public static void main(String[] args) {
		String a, b, c, m;
		int day, i;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите день: ");
		day = in.nextInt();
		in.close();
		a = "герань";
		b = "фиалки";
		c = "кактус";
//		System.out.println("Исходное положение: " + a + ";" + b + ";" + c);
		for (i = 1; i <= day; i++) {
			m = b;
			b = c;
			c = m;
//			System.out.println("утро: " + a + ";" + b + ";" + c);
			m = a;
			a = b;
			b = m;
//			System.out.println("вечер: " + a + ";" + b + ";" + c);
		}
		System.out.println(a + ";" + b + ";" + c);
	}
}
