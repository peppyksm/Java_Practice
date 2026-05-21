package practice;

import java.util.Random;

public class Pr27 {

	public static void main(String[] args) {
		
		//랜덤으로 학생 점수를 생성하고 등급(A/B/C/D/F)을 분류하시오.

		Random random = new Random();
		int score = random.nextInt(100)+1;

		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
