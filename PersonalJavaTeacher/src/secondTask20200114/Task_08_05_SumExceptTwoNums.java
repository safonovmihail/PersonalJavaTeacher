package secondTask20200114;

// 8.5. Напишите программу, которая выводит все 
// целые числа от 0 до 11, кроме чисел 3 и 6.

public class Task_08_05_SumExceptTwoNums {

	public static void main(String[] args) {
		int i, sum;
		sum = 0;
		for (i = 0; i <= 11; i++) {
			if (i == 3 || i == 6) {
				continue;
			}
			sum = sum + i;
//			Это мне для понимания работы программы
			System.out.println("i: " + i);
//			System.out.println("сумма промежуточная: " + sum);
		}
//		System.out.println();
//		System.out.println("Сумма: " + sum);
	}
}
