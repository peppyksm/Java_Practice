package practice;

public class Pr14 {

	public static void main(String[] args) {
		
		// 배열 안의 모든 값을 역순으로 출력하시오.
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = arr.length - 1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
