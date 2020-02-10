package topic09Loops_20200210;

public class Topic09Loops_Ex_05_InfiniteLoopCheck {

	public static void main(String[] args) {
		int I;
		for (I = 1;;) {
			I++;
			System.out.println("before break (I): \t" + I);
			if (I >= 5)
// ограничение бесконечного цикла с помощью проверки
				break;
			System.out.println("after break (I): \t" + I);
		}
	}
}
