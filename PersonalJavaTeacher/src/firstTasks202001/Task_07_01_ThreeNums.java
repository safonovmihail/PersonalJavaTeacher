package firstTasks202001;

//import java.io.InputStream;
import java.util.Scanner;

public class Task_07_01_ThreeNums {

	public static void main(String[] args) {
		int max;
		int min;
		float maxDif;
		// � ���� ��� ����� �������,
		// � ���� ����� ������, �
		// �� ������� ��� ����� ������� ���������� �� ����� ���������.

		Scanner in = new Scanner(System.in);
		System.out.print("������� �������� �����: ");
		int salJun = in.nextInt();
		System.out.print("������� �������� �����: ");
		int salMid = in.nextInt();
		System.out.print("������� �������� �������: ");
		int salSen = in.nextInt();
		in.close();

		if (salJun > salMid) {
			max = salJun;
		} else {
			max = salMid;
		}
		if (salSen > max) {
			max = salSen;
		}

		if (salJun < salMid) {
			min = salJun;
		} else {
			min = salMid;
		}
		if (salSen < min) {
			min = salSen;
		}
		maxDif = max / min;

		System.out.println("������������ ��������: " + max);
		System.out.println("����������� ��������: " + min);
		System.out.println("������������ �������� ������ ����������� � " + maxDif + " ���");

	}

}
