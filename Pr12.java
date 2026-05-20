package practice;

public class Pr12 {

	public static void main(String[] args) {
		
		//배열에서 가장 큰 값과 가장 작은 값을 구하시오.

		
		int[] arr= {8, 10, 5, 9 ,4, 2};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.printf("가장 큰 수 : %d, 가장 작은 수 : %d",max,min);
				

	}

}