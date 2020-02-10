package topic09Loops_20200210;

// Задача: нарисовать в шахматном порядке, 
// при невозможности решить, подсказка: вывести индексы,
// заметить закономерность

public class Topic09Loops_Ex_07_LoopNested_my02 {

	public static void main(String[] args) {
		int I, J;
		for (J = 1; J <= 5; J++) {
// J - строки
			for (I = 1; I <= 10; I++)
// I - колонки
				if ((I + J) % 2 == 0)
//					System.out.print("(" + I + J + ")");
				System.out.print("+");
				else
//					System.out.print("(" + I + J + ")");
					System.out.print("-");
			System.out.println("");
		}
	}
}

