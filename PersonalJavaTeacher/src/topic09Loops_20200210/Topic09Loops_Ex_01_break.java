package topic09Loops_20200210;

public class Topic09Loops_Ex_01_break {
// прерывание, продолжение цикла, инкермент, декремент
	public static void main(String[] args) {
		int i, sum;
		sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
			if (sum == 6)
				continue; // строка для 6 не отображается
			if (sum >= 30)
				break; // выполнение программы прерывается 
			System.out.println("i: " + i + "\t" + "sum: " + sum);
		}
	}
}
