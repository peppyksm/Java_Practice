package practice;

public class Pr04 {

	public static void main(String[] args) {
		//1~100 사이에서 3의 배수이면서 5의 배수인 수를 모두 출력하시오.


		for(int i = 1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}