package firstTasks202001;

import java.util.Scanner;

public class Task_07_07_HousePaint {

	public static void main(String[] args) {

		int wide1;
		int height;
		int wide2;
		int cap;// емкость одной банки
		int area;

		Scanner in = new Scanner(System.in);
		System.out.println("Введите габариты (ширина1 ,м.):");
		wide1 = in.nextInt();
		System.out.println("Введите габариты (ширина2, м.):");
		wide2 = in.nextInt();
		System.out.println("Введите габариты (высота, м.):");
		height = in.nextInt();
		System.out.println("Введите площадь покраски из одной банки (в кв.м.):");
		cap = in.nextInt();
		in.close();
		area = 2* height *(wide1 + wide2);
		System.out.println("Площадь покраски одного дома: " + area + " кв.м.");
		System.out.println("Для покраски необходимо банок (шт.): " + Math.ceil(area / cap));
	}
}
