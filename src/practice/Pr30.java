package practice;

import java.util.Scanner;

public class Pr30 {

	public static void main(String[] args) {

		// 각 열의 합계를 구하시오.

		Scanner scanner = new Scanner(System.in);

		int[][] arr = new int[3][3];

		System.out.println("정수 9개를 입력하세요 : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int column = 0;

		System.out.println();

		for (int i = 0; i < 3; i++) {
			column = 0;
			for (int j = 0; j < 3; j++) {
				column += arr[j][i];
			}
			System.out.println((i + 1) + "행의 합 : " + column);
		}

	}

}
