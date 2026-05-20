package practice;

public class Pr19 {

	public static void main(String[] args) {
		
		//배열의 평균보다 큰 값만 출력하시오.
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		double avg;
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i]; 
		}
		avg = (double)total / arr.length;
		System.out.println("평균 : "+avg);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > avg) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
