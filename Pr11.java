package practice;

import java.util.Scanner;

public class Pr11 {

	public static void main(String[] args) {
		//학생 5명의 점수를 배열에 저장하고 총점과 평균을 출력하시오.
		
		Scanner scanner = new Scanner(System.in);
		
		int[] score = new int[5];
		int total = 0;
		double avg;
		
		System.out.print("5명의 점수를 입력하세요 : ");
		
		for(int i = 0; i<=4; i++) {
			score[i] = scanner.nextInt();
			total += score[i];
		}
		avg = (double)total / score.length;

		System.out.printf("총점 : %d, 평균 : %f", total, avg);
		

	}

}
