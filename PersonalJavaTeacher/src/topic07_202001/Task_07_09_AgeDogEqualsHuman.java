package topic07_202001;

import java.util.Scanner;

public class Task_07_09_AgeDogEqualsHuman {
	public static void main(String[] args) {
		int ageDog;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите возраст собаки, (полных лет):");
		ageDog = in.nextInt();
		in.close();
		if (ageDog <= 2) {
			System.out.println("Возраст соответствутет человеческому, лет: " + ageDog * 10.5);
		} else {
			System.out.println("Возраст соответствутет человеческому, лет: " + ((ageDog - 2) * 4 + 10.5 * 2));
		}
	}
}
