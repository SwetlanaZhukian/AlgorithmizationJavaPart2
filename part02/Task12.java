package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {

	public static void main(String[] args) {
		int n;
		int m;

		n = enterFromConsole("Введите количество строк >> ");
		m = enterFromConsole("Введите количество столбцов >> ");
		
		int[][] mas = new int[n][m];
		initArray(mas);
		printArray(mas);

		sortDescending(mas);
		System.out.println("Массив в котором строки отсортированы по убыванию значений: ");
		printArray(mas);
		
		sortAscending(mas);
		System.out.println("Массив в котором строки отсортированы по возрастанию значений: ");
		printArray(mas);
	}

	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(20);
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

	public static int enterFromConsole(String str) {
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {

			System.out.print(str);

			while (!sc.hasNext()) {
				sc.next();
				System.out.print(str);
			}

			value = sc.nextInt();

		} while (value <= 0 || value > 20);

		return value;
	}

	public static void sortDescending(int[][] mas) {
		if (mas == null) {
			return;
		}
		int temp;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length - 1; j++) {

				for (int n = j + 1; n < mas[i].length; n++) {

					if (mas[i][j] < mas[i][n]) {
						temp = mas[i][j];
						mas[i][j] = mas[i][n];
						mas[i][n] = temp;
					}
				}

			}

		}

	}

	public static void sortAscending(int[][] mas) {
		if (mas == null) {
			return;
		}

		int temp;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length - 1; j++) {

				for (int n = j + 1; n < mas[i].length; n++) {

					if (mas[i][j] > mas[i][n]) {

						temp = mas[i][j];
						mas[i][j] = mas[i][n];
						mas[i][n] = temp;
					}

				}

			}

		}

	}

}
