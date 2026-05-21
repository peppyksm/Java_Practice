package practice;

import java.util.Scanner;

public class Pr29 {

	public static void main(String[] args) {

		//각 행의 합계를 구하시오.


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
		
		int row = 0;
		
		for(int i = 0; i < 3; i++) {
			row = 0;
			for(int j = 0; j < 3; j++) {
				row += arr[i][j];
			}
			System.out.println((i+1)+"열의 합 : "+row);
		}
		
		

	}

}
