package practice;

import java.util.Random;

public class Pr21 {

	public static void main(String[] args) {

		// 1~45 사이의 랜덤 숫자 6개를 생성하시오. (중복 불가)

		Random random = new Random();
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int num  = random.nextInt(45) + 1;
			
			boolean isDuplicate = false;
			
			for (int j = 0; j<i; j++) {
				if(arr[j] == num) {
					isDuplicate = true;
					break;
				}
			}
			
			if(isDuplicate) {
				i--;
				continue;
			}
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}

	}

}
