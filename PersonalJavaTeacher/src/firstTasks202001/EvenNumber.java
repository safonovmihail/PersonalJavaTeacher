package firstTasks202001;

import java.util.Scanner;

public class EvenNumber {

	// ����������� �������� �����

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� �����: ");
		num = in.nextInt();
		in.close();
		if (num % 2 == 0) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}

	}

}
