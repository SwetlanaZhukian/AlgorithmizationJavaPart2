package by.jonline.mod02.part02;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка N по правилу:A[I,J]= sin((I^2 -J^2)/N и подсчитать количество положительных элементов в ней.
public class Task07 {

	public static void main(String[] args) {
		int n;
		int count;
		n = enterFromConsole("Введите чётное n >> ");

		double[][] mas = new double[n][n];
		initArray(mas);
		printArray(mas);

		count = countPositiveElements(mas);
		System.out.println("Количество положительных элементов в матрице = " + count);
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

	public static void initArray(double[][] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = Math.sin((i * i - j * j) / mas.length);

			}

		}

	}

	public static void printArray(double[][] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%.2f   ", mas[i][j]);
			}

			System.out.println();
		}
	}

	public static int countPositiveElements(double[][] mas) {
		if (mas == null) {
			return 0;
		}

		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 0) {
					count++;
				}
			}

		}

		return count;

	}

}
