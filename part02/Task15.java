package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task15 {

	public static void main(String[] args) {
		int n;
		int m;
		int max;

		n = enterFromConsole("Введите количество строк >> ");
		m = enterFromConsole("Введите количество столбцов >> ");

		int[][] mas = new int[n][m];
		initArray(mas);
		System.out.println("Исходный массив");
		printArray(mas);

		max = findMax(mas);
		System.out.println("Максимальный элемент в массиве = " + max);
		System.out.println();

		replaceOddElements(mas, max);
		System.out.println("Изменённый массив");
		printArray(mas);

	}

	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		int min = -10;
		int max = 20;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt((max - min) + 1) + min;
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

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print(str);
			}

			value = sc.nextInt();

		} while (value <= 0 || value > 20);

		return value;

	}

	public static int findMax(int mas[][]) {
		if (mas == null) {
			return 0;
		}

		int max = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (max < mas[i][j]) {
					max = mas[i][j];
				}

			}

		}
		return max;

	}

	public static void replaceOddElements(int[][] mas, int max) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] % 2 != 0) {
					mas[i][j] = max;
				}

			}

		}

	}
}
