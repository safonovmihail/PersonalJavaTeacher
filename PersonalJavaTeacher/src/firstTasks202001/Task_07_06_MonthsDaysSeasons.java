package firstTasks202001;

import java.util.Scanner;

public class Task_07_06_MonthsDaysSeasons {

	public static void main(String[] args) {
		int month;
		int days;
		Scanner in = new Scanner(System.in);
		System.out.print("������� ����� ������: ");
		month = in.nextInt();
		in.close();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			System.out.println("���������� ����: " + days);
			break;
		}
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			System.out.println("���������� ����: " + days);
			break;
		}
		if (month == 2) {
			System.out.println("���������� ����: 28 ��� 29");
		}
		if (month==12|month==1|month==2) {
			System.out.println("����� ������");
		}
		if (month==3|month==4|month==5) {
			System.out.println("����� ��������");
		}
		if (month==6|month==7|month==8) {
			System.out.println("����� ������");
		}
		if (month==9|month==10|month==11) {
			System.out.println("����� �������");
		}
		
	}
}
//}