package practice;
import java.util.Random;

public class Pr21 {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[] arr = new int[6];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = random.nextInt(45)+1;
			for(int j = 0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
				System.out.print(arr[i] + " ");
			}
		}
		

	}

}
