package secondTask20200114;

// 8.3. Напишите программу, которая вычисляет сумму целых чисел от N до M 
// и выводит эту сумму и среднее значение. N и M вводятся с клавиатуры.

import java.util.Scanner;

public class Task_08_03_SumIntervalAverage {

	public static void main(String[] args) {
		int i, n, m, sum, iter;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите левую границу интервала [n]: ");
		n = in.nextInt();
		System.out.print("Введите правую границу интервала [m]: ");
		m = in.nextInt();
		in.close();
		sum = 0;
		iter = 0;
		for (i = n+1; i < m; i++) {
			sum = sum + i;
			iter ++;
		}
		System.out.println("Сумма целых чисел в интервале [n;m]: " + sum);
		System.out.println("Среднее арифметическое равно: " + (float)sum/(float)iter);
// используем приведение типов, иначе получается целочисленное деление! 
// Спасибо! великолепная задача. Очень тонкий и неторопливый подход ))) пока без стрессов		
	}

}