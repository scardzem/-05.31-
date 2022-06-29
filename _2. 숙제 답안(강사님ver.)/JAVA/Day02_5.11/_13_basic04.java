package Day02;

import java.util.Scanner;

public class _13_basic04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. 정수 10개를 입력받아 배열에 저장하고, 
			 이 정수중에서 2의 배수와 3의 배수를 출력하세요.*/
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요.");
			nums[i] = sc.nextInt();
		}
		
		for(int num : nums) {
			if(num % 2 == 0 || num % 3 == 0) {
				System.out.println(num);
			}
		}
	}
	
}
