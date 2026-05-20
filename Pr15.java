package practice;

public class Pr15 {

	public static void main(String[] args) {
		
		//배열 안의 값 중 80점 이상만 출력하시오.
		
		int[] arr = {50,60,70,80,90,100};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 80) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
