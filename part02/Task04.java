package by.jonline.mod02.part02;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
{1,  2,   3,  ... n }
{n, n -1, n -2  ...1}
{1,  2,   3,  ... n }
{n, n -1, n -2  ...1}
....................
{n, n -1, n -2  ...1}*/
public class Task04 {

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

		for (int i = 0; i < mas.length; i += 2) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = j + 1;
			}
		}

		for (int k = 1; k < mas.length; k += 2) {
			int n = mas.length;
			for (int l = 0; l < mas[k].length; l++) {
				mas[k][l] = n;
				n--;
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

}
