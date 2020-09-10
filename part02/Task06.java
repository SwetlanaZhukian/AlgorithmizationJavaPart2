package by.jonline.mod02.part02;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
{1, 1, 1 ... 1, 1, 1 }
{0, 1, 1 ... 1, 1, 0 }
{0, 0, 1 ... 1, 0, 0 }
......................
{0, 1, 1 ... 1, 1, 0 }
{1, 1, 1 ... 1, 1, 1 }*/
public class Task06 {

	public static void main(String[] args) {
		int n;
		n = enterFromConsole("Введите чётное n >> ");

		int[][] mas = new int[n][n];
		initArray(mas);
		printArray(mas);

	}

	public static int enterFromConsole(String str) {
		int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {

			System.out.print(str);

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print(str);
			}

			n = sc.nextInt();

		} while (n <= 0 || n > 20 || n % 2 != 0);

		return n;
	}

	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		int n = 0;
		int m = mas.length - 1;

		// верхняя половина
		for (int i = 0; i < mas.length / 2; i++) {
			for (int j = n; j < mas[i].length / 2; j++) {
				mas[i][j] = 1;
			}
			n++;
		}
		for (int i = 0; i < mas.length / 2; i++) {
			for (int j = m; j >= mas[i].length / 2; j--) {
				mas[i][j] = 1;
			}
			m--;
		}

		n = 0;
		m = mas.length - 1;

		// нижняя половина
		for (int i = mas.length - 1; i >= mas.length / 2; i--) {
			for (int j = n; j < mas[i].length / 2; j++) {
				mas[i][j] = 1;
			}
			n++;
		}
		for (int i = mas.length - 1; i >= mas.length / 2; i--) {
			for (int j = m; j >= mas[i].length / 2; j--) {
				mas[i][j] = 1;
			}
			m--;
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
}
