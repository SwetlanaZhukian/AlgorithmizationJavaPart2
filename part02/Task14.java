package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца*/
public class Task14 {

	public static void main(String[] args) {
		int n;
		int m;

		n = enterFromConsole("Введите количество строк >> ");
		m = enterFromConsole("Введите количество столбцов >> ");
		while (m > n) {
			m = enterFromConsole("Введите количество столбцов >> ");
		}

		int[][] mas = new int[n][m];
		initArray(mas);
		System.out.println("Матрица состоящая из нулей и единиц в случайном порядке");
		printArray(mas);

		change(mas, m);
		System.out.println("Матрица состоящая из нулей и единиц в которой в  каждом столбце число\r\n"
				+ "единиц равно номеру столбца ");
		printArray(mas);
	}

	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		// алгоритм для заполнения единицами с первого элемента столбца
		/*
		 * int n = 1;
		 * 
		 * for (int j = 0; j < m; j++) {
		 * 
		 * for (int i = 0; i < n; i++) { mas[i][j] = 1; }
		 * 
		 * n++; }
		 */
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(2);

			}

		}
	}

	public static void printArray(int[][] mas) {
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

	public static void change(int[][] mas, int m) {

		int sum;

		for (int k = 0; k < m; k++) {
			sum = 0;

			for (int n = 0; n < mas.length; n++) {
				sum = sum + mas[n][k];
			}

			for (int l = 0; l < mas.length; l++) {

				if (sum == k + 1) {
					break;
				}

				if (sum < k + 1 && mas[l][k] == 0) {
					mas[l][k] = 1;
					k--;
					break;

				} else if (sum > k + 1 && mas[l][k] == 1) {
					mas[l][k] = 0;
					k--;
					break;
				}

			}

		}

	}

}
