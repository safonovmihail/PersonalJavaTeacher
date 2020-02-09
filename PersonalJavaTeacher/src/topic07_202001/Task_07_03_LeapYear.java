package topic07_202001;

import java.util.Scanner;

public class Task_07_03_LeapYear {

//определить, является ли год високосным

	public static void main(String[] args) {
		int birthYear;
		Scanner in = new Scanner(System.in);
		System.out.print("введите год рождения: ");
		birthYear = in.nextInt();
		in.close();
		if (birthYear % 4 == 0 & birthYear % 400 != 0) {
			System.out.print("год високосный");
		} else {
			System.out.println("год не високосный");
		}
	}
}
