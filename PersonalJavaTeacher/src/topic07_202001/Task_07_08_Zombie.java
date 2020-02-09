package topic07_202001;

import java.util.Scanner;

public class Task_07_08_Zombie {

	public static void main(String[] args) {
		int hid;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите идентификатор: ");
		hid = in.nextInt();
		in.close();
		if (hid % 5 == 0 & hid % 11 == 0) {
			System.out.println("Перед вами человек!");
		} else {
			System.out.println("Огонь!!! Это зомби!!!");
		}
	}
}
