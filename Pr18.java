package practice;

public class Pr18 {

	public static void main(String[] args) {
		
		//배열 안에서 특정 숫자가 몇 개 존재하는지 출력하시오.
		
		int[] arr = {1,2,3,3,4,4,4,5};
		int point = 4;
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == point) {
				count++;
			}
		}
		
		System.out.printf("배열 안에 %d가 총 %d개 들어있습니다.",point,count);

	}

}
