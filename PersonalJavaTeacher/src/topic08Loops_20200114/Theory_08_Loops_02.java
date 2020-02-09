package topic08Loops_20200114;

// Конечно, начальное значение счётчика (например, переменной i) 
// может быть не 1, 
// а любое другое число, и меняться она может произвольно

public class Theory_08_Loops_02 {

	public static void main(String[] args) {
		int i, sum;
		sum = 1;
		for (i = -25; i > -100; i = i - 15) {
			sum = sum * i;
			System.out.println("sum: " + sum);
			System.out.println("i: " + i);
		}
		System.out.println();
		System.out.println("sum: " + sum);
	}
}
