package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task01 {

	public static void main(String[] args) {
		int n;
		int m;

		n = enterFromConsole("Введите n >> ");
		m = enterFromConsole("Введите m >> ");

		int[][] mas = new int[n][m];
		initArray(mas);
		System.out.println("Исходная матрица: ");
		printArray(mas);
		
		System.out.println("Нечетные столбцы, у которых первый элемент больше последнего: ");
		printOddColumns(mas);
	}

	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
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

		} while (value <= 0 || value > 10);

		return value;

	}

	public static void printOddColumns(int[][] mas) {
		if (mas == null) {
			return;
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j += 2) {
				if (mas[0][j] > mas[mas.length - 1][j]) {
					System.out.print(mas[i][j] + " ");
				}

			}
			System.out.println();
		}

	}

}
