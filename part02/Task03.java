package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task03 {

	public static void main(String[] args) {
		int n;
		int m;
		int k;
		int p;

		n = enterFromConsole("Введите n >> ");
		m = enterFromConsole("Введите m >> ");

		int[][] mas = new int[n][m];
		initArray(mas);
		printArray(mas);

		k = enterFromConsole("Введите k >> ");
		while (k >= n) {
			k = enterFromConsole("Введите k >> ");
		}

		System.out.println(k + " строка: ");
		printRow(mas, k);

		p = enterFromConsole("Введите p >> ");
		while (p >= m) {
			p = enterFromConsole("Введите p >> ");
		}

		System.out.println(p + " столбец: ");
		printColumn(mas, p);

	}

	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
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

	public static void printRow(int[][] mas, int k) {
		if (mas == null) {
			return;
		}

		for (int j = 0; j < mas[k].length; j++) {
			System.out.print(mas[k - 1][j] + " ");
		}

		System.out.println();
	}

	public static void printColumn(int[][] mas, int p) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][p - 1] + " ");

		}

	}

}
