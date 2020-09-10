package by.jonline.mod02.part02;

import java.util.Random;
import java.util.Scanner;

/*В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/
public class Task08 {

	public static void main(String[] args) {
		int n;
		int m;
		int k;
		int p;

		n = enterFromConsole("Введите количество строк >> ");
		m = enterFromConsole("Введите количество столбцов >> ");
		while (m <= 1) {
			m = enterFromConsole("Введите количество столбцов >> ");
		}

		int[][] mas = new int[n][m];
		initArray(mas);
		System.out.println("Исходная матрица: ");
		printArray(mas);

		k = enterFromConsole("Введите значение первого столбца >> ");
		while (k >= m) {
			k = enterFromConsole("Введите значение первого столбца >> ");
		}

		p = enterFromConsole("Введите значение второго столбца >> ");
		while (p > m || p == k) {
			p = enterFromConsole("Введите значение второго столбца >> ");
		}

		swapColumns(mas, k, p);
		System.out.println("Матрица в которой " + k + " и " + p + " столбцы изменены ");
		printArray(mas);

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

			while (!sc.hasNext()) {
				sc.next();
				System.out.print(str);
			}

			value = sc.nextInt();

		} while (value <= 0 || value > 20);

		return value;
	}

	public static void swapColumns(int[][] mas, int k, int p) {
		if (mas == null) {
			return;
		}

		int temp;

		for (int i = 0; i < mas.length; i++) {

			temp = mas[i][k - 1];
			mas[i][k - 1] = mas[i][p - 1];
			mas[i][p - 1] = temp;
		}

	}
}
