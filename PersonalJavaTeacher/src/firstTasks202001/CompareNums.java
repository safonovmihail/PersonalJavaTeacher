package firstTasks202001;

import java.util.Scanner;

public class CompareNums {

	public static void main(String[] args) {
		float num1;
		float num2;

		Scanner in = new Scanner(System.in);
		System.out.print("������� ������ ������������ �����: ");
		num1 = in.nextFloat();
		System.out.print("������� ������ ������������ �����: ");
		num2 = in.nextFloat();
		in.close();
		if (num1 * 1000 / 1000 == num2 * 1000 / 1000) {
			System.out.println("����� ��������� �� �������� �����");
		} else {
			System.out.println("����� �� ��������� �� �������� �����");
		}
	}

}
