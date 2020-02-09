package secondTask20200114;

public class Task_08_05_SumExceptTwoNums {

	public static void main(String[] args) {
		int i, sum;
		sum = 0;
		for (i = 0; i <= 11; i++) {
			if (i == 3 || i == 6) {
				continue;
			}
			sum = sum + i;
			System.out.println("i: " + i);
		}
	}
}
