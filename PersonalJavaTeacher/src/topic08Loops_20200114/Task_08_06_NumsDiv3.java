package topic08Loops_20200114;

public class Task_08_06_NumsDiv3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("*333*555*");
				continue;
			}
			if (i % 3 == 0) {
				System.out.println("*333*");
				continue;
			}
			if (i % 5 == 0) {
				System.out.println("*555*");
				continue;
			}
			System.out.println(i);
		}
	}
}
