package practice;

import java.util.Scanner;

public class Pr06 {

	public static void main(String[] args) {
		//입력받은 수의 팩토리얼 값을 계산하시오.

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputNum = scanner.nextInt();
		int factorial = 1;
		
		for(int i = inputNum; i >= 1; i--) {
			factorial *= i;
		}
		System.out.printf("%d의 팩토리얼 값은 %d 입니다.", inputNum, factorial);

	}

}
