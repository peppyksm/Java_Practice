package practice;

import java.util.Random;
import java.util.Scanner;

public class Pr23 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("진짜 즐거운 업다운 게임~");
		System.out.println("규칙 : 기회는 5번, 1~50까지의 숫자 중에 맞추세요~");
		
		int randNum = random.nextInt(50)+1;
		int inputNum;
		for(int i = 0; i<5; i++) {
			System.out.print("숫자를 맞춰보세요 : ");
			inputNum = scanner.nextInt();
			
			if(inputNum > randNum) {
				System.out.println("다운");
			}else if(inputNum < randNum) {
				System.out.println("업");
			}
			if(inputNum == randNum) {
				System.out.println("우승~");
				break;
			}
			
			if(i==4) {
				System.out.println("게임 종료.. 처참하게 패배 ㅠㅠ");
			}
		}

	}

}
