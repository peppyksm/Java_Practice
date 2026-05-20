package practice;

import java.util.Scanner;

public class Pr05 {

	public static void main(String[] args) {
		//입력받은 숫자만큼 '*'을 출력하시오
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputNum = scanner.nextInt();
		
		for(int i = 0; i<inputNum; i++) {
			System.out.print("*");
		}

	}

}