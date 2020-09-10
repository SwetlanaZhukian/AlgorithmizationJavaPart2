package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму*/
public class Task09 {

	public static void main(String[] args) {
		int n;
		int m;

		n = enterFromConsole("Введите количество строк >> ");
		m = enterFromConsole("Введите количество столбцов >> ");
		int[][] mas = new int[n][m];
		initArray(mas);
		printArray(mas);
		countSumOfElementsInColumn(mas, m);

	}

	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(20);
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

			while (!sc.hasNext()) {
				sc.next();
				System.out.print(str);
			}

			value = sc.nextInt();

		} while (value <= 0 || value > 20);

		return value;
	}

	public static void countSumOfElementsInColumn(int[][] mas, int m) {
		if (mas == null) {
			return;
		}
		
		int sum = 0;
		int max = 0;
		int index = 0;
		
		for (int j = 0; j < m; j++) {
			sum = 0;
			for (int i = 0; i < mas.length; i++) {
				sum = sum + mas[i][j];
			}
			
			if (max < sum) {
				max = sum;
				index = j;
			}
			
			System.out.println("Сумма элементов  " + j + " столбцa = " + sum);

		}

		System.out.println(index + " столбец содержит максимальную сумму = " + max);
	}

}
