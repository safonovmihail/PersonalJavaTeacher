package secondTask20200114;

// Вася начинающий хакер. Он планирует взломать кэш Windows на компьютере приятеля, 

// чтобы вытащить оттуда его пароль ВКонтакте, но пока не может разобраться, 
// какие числа в кэше служебные.
// Служебными условно будем считать бинарные числа, которые представляют собой 
// степень двойки -- 1,2,4,8,16,32,...
// Помогите Васе определить, будет ли некоторое целое положительное число, 
// вводимое в программу, бинарным.
import java.util.Scanner;

public class Task_08_08_VasyaHacker_02 {

	public static void main(String[] args) {
		int n, i;

		System.out.println("Введите число: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();

		for (i = 2; (i <= n); i = 2 * i) {
			if (n % i != 0) {
				System.out.println("Число не служебное");
				break;
			} else if (n / i == 1) {
				System.out.println("Служебное число");
			}
		}
	}
}
