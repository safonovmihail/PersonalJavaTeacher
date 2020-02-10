package topic09Loops_20200210;

public class Topic09Loops_Ex_03_LogicContinue {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 5; i++) {
			if (i == 2 || i == 4)
				continue;
// вывод в консоль всех чисел от 1 до 5, кроме 2 и 4
// вариант 2, с помощью оператора [continue]
			System.out.println(i);
		}
	}

}
