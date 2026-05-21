package practice;

import java.util.Scanner;

public class Pr28 {

	public static void main(String[] args) {

		// 3x3 배열에 값을 입력받아 출력하시오.

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
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
