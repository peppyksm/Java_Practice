package practice;

public class Pr09 {

	public static void main(String[] args) {
		
		//두 주사위 눈의 합이 8이 되는 모든 경우를 출력하시오.
		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<=6; j++) {
				if(i + j == 8) {
					System.out.printf("%d + %d = %d\n",i,j,(i+j));
				}
			}
		}

	}

}