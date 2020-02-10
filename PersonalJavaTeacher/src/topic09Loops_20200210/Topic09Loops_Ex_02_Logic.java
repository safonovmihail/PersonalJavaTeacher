package topic09Loops_20200210;

public class Topic09Loops_Ex_02_Logic {

	public static void main(String[] args) {
		int i;
// печать всех чисел кроме двух
		for (i = 1; i <= 5; i++)
			if (i != 2 && i != 4)
				System.out.println(i);
	}
}
