package practice;

public class Pr07 {

	public static void main(String[] args) {
		//구구단 2단~9단 전체를 출력하시오.
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
		}

	}

}