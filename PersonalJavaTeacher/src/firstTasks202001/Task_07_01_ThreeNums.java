package firstTasks202001;

//import java.io.InputStream;
import java.util.Scanner;

public class Task_07_01_ThreeNums {

	public static void main(String[] args) {
		int max;
		int min;
		float maxDif;
		// у кого она самая высокая,
		// у кого самая низкая, и
		// во сколько раз самая большая отличается от самой маленькой.

		Scanner in = new Scanner(System.in);
		System.out.print("введите зарплату джуна: ");
		int salJun = in.nextInt();
		System.out.print("введите зарплату мидла: ");
		int salMid = in.nextInt();
		System.out.print("введите зарплату синьера: ");
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

		System.out.println("Максимальная зарплата: " + max);
		System.out.println("Минимальная зарплата: " + min);
		System.out.println("Максимальная зарплата больше минимальной в " + maxDif + " раз");

	}

}
