package topic07_202001;

import java.util.Scanner;

public class Task_07_10_BoyGirlCompatibility {

	static double sumNum(int ageBirth) {
		double num1 = Math.floor(ageBirth / 1000);
		double num2 = Math.floor(ageBirth / 100) - num1 * 10;
		double num3 = Math.floor(ageBirth / 10) - Math.floor(ageBirth / 100) * 10;
		double num4 = ageBirth - Math.floor(ageBirth / 10) * 10;
		return (num1 + num2 + num3 + num4);
	}

	public static void main(String[] args) {
		int ageBirthBoy;
		int ageBirthGirl;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите год рождения молодого человека: ");
		ageBirthBoy = in.nextInt();
		System.out.println("Введите год рождения девушки: ");
		ageBirthGirl = in.nextInt();
		in.close();
		if (ageBirthBoy <= 1900 | ageBirthBoy >= 2100 | ageBirthGirl <= 1900 | ageBirthGirl >= 2100) {
			System.out.println("Возраст вне рассматриваемого диапазона, [1900:2100]");
		} else if (sumNum(ageBirthGirl) > sumNum(ageBirthBoy)) {
			System.out.println("Кандидатура одобрена");
		} else {
			System.out.println("Кандидат не подходит");
		}
	}
}
