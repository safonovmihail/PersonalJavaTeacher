package firstTasks202001;

import java.util.Scanner;

public class Task_07_03_LeapYear {

//����������, �������� �� ��� ����������

	public static void main(String[] args) {
		int birthYear;
		Scanner in = new Scanner(System.in);
		System.out.print("������� ��� ��������: ");
		birthYear = in.nextInt();
		in.close();
		if (birthYear % 4 == 0 & birthYear % 400 != 0) {
			System.out.print("��� ����������");
		} else {
			System.out.println("��� �� ����������");
		}
	}

}
