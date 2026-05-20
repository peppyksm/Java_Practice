package practice;

import java.util.Scanner;

public class Pr10 {

	public static void main(String[] args) {
		//정수를 입력받아 양수/음수/0을 판별하시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputNum = scanner.nextInt();
		
		if(inputNum > 0) {
			System.out.println("양수 입니다.");
		}else if(inputNum < 0) {
			System.out.println("음수 입니다.");
		}else {
			System.out.println("0 입니다.");
		}

	}

}