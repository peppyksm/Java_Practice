package practice;

import java.util.Scanner;

public class Pr31 {

	public static void main(String[] args) {
		
		// 전체 합계를 구하시오.

		Scanner scanner = new Scanner(System.in);

		int[][] arr = new int[3][3];

		System.out.println("정수 9개를 입력하세요 : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		int total = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
				total += arr[i][j];
			}
			System.out.println();
		}
		
		System.out.println("총 합: "+total);

	}

}
