package practice;

import java.util.Scanner;

public class Pr17 {

	public static void main(String[] args) {
		
		//사용자에게 10개의 숫자를 입력받아 합계를 구하시오.
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		
		System.out.print("10개의 정수를 입력하시오 : ");
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		
		System.out.println("총합 : "+sum);

	}

}
