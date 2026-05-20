package practice;

import java.util.Scanner;

public class Pr03 {

	public static void main(String[] args) {
		//두 정수를 입력받아 큰 수와 작은 수를 출력하시오.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int inputNum1 = scanner.nextInt();
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int inputNum2 = scanner.nextInt();
		
		if(inputNum1 > inputNum2) {
			System.out.printf("%d이(가) %d보다 더 큽니다\n", inputNum1, inputNum2);
		}else if(inputNum1 < inputNum2) {
			System.out.printf("%d이(가) %d보다 더 큽니다\n", inputNum2, inputNum1);
		}else {
			System.out.println("두 수가 같은 수 입니다.");
		}
	}

}