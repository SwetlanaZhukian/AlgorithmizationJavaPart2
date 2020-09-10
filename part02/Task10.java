package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

//Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {

	public static void main(String[] args) {
		int n;
		n = enterFromConsole("Введите n >> ");

		int[][] mas = new int[n][n];
		initArray(mas);
		printArray(mas);

		System.out.println("Положительные элементы на диагонали:");
		findPositiveElementsOnDiagonal(mas);
	}

	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		int min = -10;
		int max = 10;
		Random rand = new Random();

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
				System.out.print(mas[i][j] + "   ");
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

			while (!sc.hasNext()) {
				sc.next();
				System.out.print(str);
			}

			value = sc.nextInt();

		} while (value <= 0 || value > 20);

		return value;
	}

	public static void findPositiveElementsOnDiagonal(int[][] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			if (mas[i][i] > 0) {
				System.out.print(mas[i][i] + " ");
			}

		}

	}

}
