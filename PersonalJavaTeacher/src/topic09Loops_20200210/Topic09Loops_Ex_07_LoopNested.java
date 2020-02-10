package topic09Loops_20200210;

public class Topic09Loops_Ex_07_LoopNested {

	public static void main(String[] args) {
		int I, J;
		for (J = 1; J <= 5; J++) {
// J - строки
			for (I = 1; I <= 10; I++)
// I - колонки
				if (I % 2 == 1)
					System.out.print("+");
				else
					System.out.print("-");
			System.out.println("");
		}
	}
}
// интересной задачей  будет поменять + и - местами на последующих строках
