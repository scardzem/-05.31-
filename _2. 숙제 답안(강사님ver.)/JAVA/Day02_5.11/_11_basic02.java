package Day02;

import java.util.Scanner;

public class _11_basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. int배열을 10개 생성해라
  			 사용자로부터 10개의 값을 입력받고
  			 순서대로 출력하고 
  			 총합을 구하세요*/
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요.");
			nums[i] = sc.nextInt();
		}
		
		for(int num : nums) {
			sum += num;
			System.out.println(num);
		}
		
		System.out.println("총 합은 : " + sum);
	}

}
