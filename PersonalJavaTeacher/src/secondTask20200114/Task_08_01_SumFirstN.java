package secondTask20200114;

//8.1. Напишите программу, которая вычисляет сумму первых N целых чисел, начиная с 1. 
//Значение N вводится с клавиатуры в начале работы программы.

import java.util.Scanner;
//импортируем что? Четко описать каждый элемент конструкции[2020-01-17] 

public class Task_08_01_SumFirstN {

	public static void main(String[] args) {
// "заготовка" (или как лучше назвать) для программы - объявление переменных
		int i, sum, n;
		Scanner in = new Scanner(System.in);
// объявляем и инициализируем переменную [in] типа [Scanner] 
// переменная [in] является переменной ссылочного типа
// в нее заносится экземпляр класса [Scanner()]
// (System.in): четко и формализованно не могу описать.
// (System.in): метод? Из чего он состорит?
		System.out.print("Введите число [n]: ");
// инициализируем переменную, но как?
// in.nextInt(): не могу подробно описать приведенную конструкцию
		n = in.nextInt();
// in.close(): как четко описать, что сдесь происходит?		
		in.close();

		// для вычисления суммы всех чисел используем цикл [for]

// инициализируем переменную для накопления суммы
		sum = 0;
		for (i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Сумма всех чисел для [n] равна: " + sum );
// [задание] выяснить, как использовать параметрический вывод
	}
}
