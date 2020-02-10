package topic09Loops_20200210;

public class Topic09Loops_HW_01_Triangle {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (i = 4; i > 0; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
