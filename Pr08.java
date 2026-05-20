package practice;

public class Pr08 {

	public static void main(String[] args) {
		
		//1~100 중 소수를 모두 출력하시오.
		
		for(int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.print(i + " ");
			}
		}
		
	}
}