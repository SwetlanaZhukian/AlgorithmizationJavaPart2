package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

/*Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,n^2
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны междусобой. Построить такой квадрат.*/
public class Task16 {

	public static void main(String[] args) {
		int n;
		int number;

		n = enterFromConsole("Введите n >> ");
		int[] mas = new int[n * n];
		int[][] mas1 = new int[n][n];
		initArray(mas);
		printArray(mas, n);
		int length = mas.length;
		number = n * (n * n + 1) / 2;
		swapElements(mas, length, number, n);
		/*
		 * initMas2(mas, mas1); printArray2(mas1);
		 */
		// number = n * (n * n + 1) / 2;
		System.out.println(number);

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

	/*
	 * public static void initArray2(int[][] mas, int n) { int k = n * n; for (int i
	 * = 0; i < mas.length; i++) { for (int j = 0; j < mas[i].length; j++) {
	 * mas[i][j] = k; k--;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 */

	public static void printArray2(int[][] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void initArray(int[] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			mas[i] = i + 1;
		}

	}

	public static void printArray(int[] mas, int n) {
		int x = mas.length / n;
		int i = 0;
		int count = 0;
		while (i < mas.length) {
			System.out.print(mas[i] + " ");
			count++;
			if (count == x) {
				System.out.println();
				count = 0;
			}
			i++;
		}

	}

	public static void initMas2(int[] mas, int[][] mas1) {
		int count = 0;
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = mas[count++];

			}

		}

	}

	public static void name1(int[][] mas, int n) {
		int sum;
		for (int i = 0; i < mas.length; i++) {
			sum = 0;
			for (int j = 0; j < mas[i].length; j++) {
				sum = sum + mas[i][j];
			}

		}

	}

	public static void swapElements(int mas[], int n, int m, int j) {
		if (n == 1) {
			boolean b = proverka(mas, j, m);
			if (b) {
				printArray(mas, j);
				System.out.println();
			}

		}
		for (int i = 0; i < n; i++) {
			swapElements(mas, n - 1, m, j);
			if (n % 2 == 1) {
				int temp = mas[0];
				mas[0] = mas[n - 1];
				mas[n - 1] = temp;
			} else {
				int temp = mas[i];
				mas[i] = mas[n - 1];
				mas[n - 1] = temp;
			}

		}
	}

	public static boolean proverka(int[] mas, int n, int m) {
		boolean b = false;
		int sum = 0;
		int i = 0;
		int count = 0;
		int r = mas.length / n;
		boolean c = false;
		int sum2 = 0;
		int j = 0;

		while (i < mas.length) {
			sum = sum + mas[i];
			count++;
			i++;
			if (count == r) {
				if (sum == m) {
					b = true;
				} else {
					b = false;
					break;
				}
				sum = 0;
				count = 0;
			}
		}

		while (j < r) {
			int g = j;
			while (g < mas.length) {
				sum2 = sum2 + mas[g];
				g = g + r;
			}
			if (sum2 == m) {
				c = true;
			} else {
				c = false;
				break;
			}
			sum2 = 0;
			j++;

		}

		return b&&c;

	}
}
