package practice;

import java.util.Random;

public class Pr24 {

	public static void main(String[] args) {
		
		//랜덤 숫자 5개를 배열에 저장하고 정렬 없이 최대값을 구하시오.
		
		Random random = new Random();
		int[] arr = new int[5];
		
		System.out.println("배열에 저장된 수");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = random.nextInt();
			System.out.print(arr[i] + " ");
		}
		int max = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : "+max );
		
		

	}

}
