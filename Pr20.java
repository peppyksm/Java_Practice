package practice;

public class Pr20 {

	public static void main(String[] args) {
		
		//배열의 중복 값을 검사하여 출력하시오
		
		int[] arr = {1,2,3,4,4,5,5,6,7};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j <arr.length; j++) {
				if(i != j && arr[i] == arr[j]) {
					System.out.println(arr[i] + " 중복");
				}
			}
		}
	}
}