package practice;

import java.util.Random;

public class Pr26 {

	public static void main(String[] args) {

		//랜덤 점수 10개를 생성하고 평균을 출력하시오
		Random random = new Random();
		int[] arr = new int[10];
		int total = 0;
		int avg;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt();
			total+=arr[i];
		}
		avg = total / arr.length;
		
		System.out.println("배열의 평균 : "+avg);

	}

}
