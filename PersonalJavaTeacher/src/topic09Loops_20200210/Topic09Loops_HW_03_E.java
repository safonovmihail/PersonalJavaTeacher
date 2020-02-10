package topic09Loops_20200210;

public class Topic09Loops_HW_03_E {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 7; i++) {
			System.out.print("*");
			for (j = 1; j <= 4; j++) {
				if (i == 2 || i == 3 || i == 5 || i == 6)
					continue;
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
