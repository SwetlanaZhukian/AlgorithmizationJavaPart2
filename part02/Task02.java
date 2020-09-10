package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
public class Task02 {

	public static void main(String[] args) {
		int n;
		n = enterFromConsole("Введите n >> ");

		int[][] mas = new int[n][n];
		initArray(mas);
		printArray(mas);

		System.out.println("Элементы стоящие на диагонали: ");
		printDiagonal(mas);

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

	private static void printDiagonal(int[][] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][i] + " ");

		}

	}

}
