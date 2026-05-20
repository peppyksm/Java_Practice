package practice;

import java.util.Scanner;

public class Pr02 {

	public static void main(String[] args) {
		//정수 하나를 입력받아 홀수인지 짝수인지 출력하시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputNum = scanner.nextInt();
		
		if(inputNum == 0) {
			System.out.println("0 입니다.");
		}else if(inputNum % 2 == 0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}

	}

}
