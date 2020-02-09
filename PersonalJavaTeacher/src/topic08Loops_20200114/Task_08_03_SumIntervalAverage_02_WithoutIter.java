package secondTask20200114;

import java.util.Scanner;

public class Task_08_03_SumIntervalAverage_02_WithoutIter {

	public static void main(String[] args) {
			int i, n, m, sum;
			Scanner in = new Scanner(System.in);
			System.out.print("Введите левую границу интервала [n]: ");
			n = in.nextInt();
			System.out.print("Введите правую границу интервала [m]: ");
			m = in.nextInt();
			in.close();
			sum = 0;
			for (i = n; i <= m; i++) {
				sum = sum + i;
			}
			System.out.println("Сумма целых чисел в интервале [n;m]: " + sum);
			System.out.println("Среднее арифметическое равно: " + (float)sum/(float)(m-n+1));
		}
	}