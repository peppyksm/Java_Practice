package practice;

import java.util.Random;
import java.util.Scanner;

public class Pr22 {

	public static void main(String[] args) {

		// 가위바위보 게임을 구현하시오

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String[] arr = { "가위", "바위", "보" };

		System.out.println("즐거운 가위바위보 게임~");
		System.out.println("규칙1 : 플레이어는 가위 or 바위 or 보 입력");
		System.out.println("규칙2 : 둘 중 한명이 3점 득점 시 게임 종료");
		System.out.println();
		
		System.out.print("플레이어 닉네임 입력 : ");
		String name = scanner.nextLine();
		
		String p1;
		int p2;
		
		int p1Point = 0;
		int p2Point = 0;
		
		String replay;
		
		while(true) {
			System.out.printf("현재 점수 : %s:%d  상대방:%d\n",name,p1Point,p2Point);
			System.out.println();
			
			System.out.print("가위 or 바위 or 보 를 입력하세요 : ");
			p1 = scanner.nextLine();
			p2 = random.nextInt(3);
			System.out.println();

			System.out.println(name+"님은 " + p1 + "를 냈습니다.");
			System.out.println("상대방이 " + arr[p2] + "를 냈습니다.");
			
			if (p1.equals("가위") && p2 == 0) {
				System.out.println("비겼습니다.");
				System.out.println();
			} else if (p1.equals("바위") && p2 == 1) {
				System.out.println("비겼습니다.");
				System.out.println();
			} else if (p1.equals("보") && p2 == 2) {
				System.out.println("비겼습니다.");
				System.out.println();
			} else if (p1.equals("가위") && p2 == 2) {
				System.out.println("플레이어님이 이겼습니다.");
				System.out.println();
				p1Point++;
			} else if (p1.equals("바위") && p2 == 0) {
				System.out.println(name+"님이 이겼습니다.");
				System.out.println();
				p1Point++;
			} else if (p1.equals("보") && p2 == 1) {
				System.out.println(name+"님이 이겼습니다.");
				System.out.println();
				p1Point++;
			} else {
				System.out.println("상대방이 이겼습니다.");
				System.out.println();
				p2Point++;
			}
			
			if(p1Point >= 3) {
				System.out.println(name+"님 승!");
				System.out.println("다시 플레이 하시겠습니까?(y/n) : ");
				replay = scanner.nextLine();
				if(replay.equals("y")) {
					System.out.println("게임을 다시 플레이합니다.");
					p1Point = 0;
					p2Point = 0;
				}else if(replay.equals("n")){
					System.out.println("게임을 종료합니다.");
					break;
				}
				
			}
			if(p2Point >= 3) {
				System.out.println("상대방 승 ㅋ");
				System.out.println(name+"님은 그냥 누가봐도 처참하게 패배해버렸습니다 ㅠ");
				System.out.println("다시 플레이 하시겠습니까?(y/n) : ");
				replay = scanner.nextLine();
				if(replay.equals("y")) {
					System.out.println("게임을 다시 플레이합니다.");
					p1Point = 0;
					p2Point = 0;
				}else if(replay.equals("n")){
					System.out.println("게임을 종료합니다.");
					break;
				}else {
					System.out.println("잘못 입력했습니다. 그냥 나가세요..");
					break;
				}
			}
		}
	}
}