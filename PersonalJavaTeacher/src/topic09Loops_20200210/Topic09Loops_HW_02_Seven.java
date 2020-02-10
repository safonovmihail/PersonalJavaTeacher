package topic09Loops_20200210;

public class Topic09Loops_HW_02_Seven {

	public static void main(String[] args) {
		int a, count;
		count = 0;
		for (a = 100; a <= 400; a++) {
			if (a % 7 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
