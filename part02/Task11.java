package by.jonline.mod02.part02;

import java.util.Random;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
*/
public class Task11 {

	public static void main(String[] args) {
		int[][] mas = new int[10][20];
		initArray(mas);
		printArray(mas);
		findRowNumber(mas);

	}

	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(15);
			}

		}
	}

	public static void printArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
	}

	public static void findRowNumber(int[][] mas) {
		if (mas == null) {
			return;
		}

		int count;

		for (int i = 0; i < mas.length; i++) {
			count = 0;

			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5) {
					count++;
				}
			}

			if (count >= 3) {
				System.out.println("В строке " + i + " число 5 встречается 3 и более раз");
			}

		}

	}

}
