package practice;

import java.util.Random;

public class Pr25 {

	public static void main(String[] args) {
		
		//동전 던지기 10번 결과를 출력하고 앞면/뒷면 개수를 출력하시오.
		Random random = new Random();
		
		System.out.println("동전을 던졌습니다.");
		int result = 0;
		int frontPoint = 0;
		int backPoint = 0;
		
		for(int i = 0; i < 10; i++) {
			result = random.nextInt(2);
			
			if(result == 0) {
				System.out.println("앞면");
				frontPoint++;
			}else {
				System.out.println("뒷면");
				backPoint++;
			}
			
			if(i == 9) {
				System.out.println("결과 발표");
				System.out.printf("앞면 : %d번 뒷면 : %d번",frontPoint,backPoint);
			}
		}

	}

}
