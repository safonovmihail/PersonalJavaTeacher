package firstTasks202001;

import java.util.Scanner;

public class CompareThreeNums {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите первое число: ");
		num1 = in.nextInt();
		System.out.println("¬ведите второе число: ");
		num2 = in.nextInt();
		System.out.println("¬ведите третье число: ");
		num3 = in.nextInt();
		in.close();
		if (num1 == num2 & num2 == num3) {
			System.out.println("all equals");
		} else if (num1 != num2 & num2 != num3) {
			System.out.println("all different");
		}
		else {
			System.out.println("Equals or different");
		}
	}
}
