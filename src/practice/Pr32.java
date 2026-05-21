package practice;

import java.util.Scanner;

public class Pr32 {

	public static void main(String[] args) {
		
		//가장 큰 값의 위치(row, col)를 출력하시오.

		Scanner scanner = new Scanner(System.in);

		int[][] arr = new int[3][3];

		System.out.println("정수 9개를 입력하세요 : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		int max = arr[0][0];
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
