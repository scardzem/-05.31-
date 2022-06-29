package Day02;

public class _10_basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. int배열을 10개 생성해라.
 			 int배열에 3의 배수를 차례대로 저장해라.
 			 그리고 거꾸로 출력해라.*/
		int[] nums = new int[10];
		int num = 1;
		int count = 0;
		
		while(true) {
			if(num % 3 == 0) {
				nums[count++] = num;
			}
			num++;
			
			if(count == 10) {
				break;
			}
		}
		
		for(int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}

}
