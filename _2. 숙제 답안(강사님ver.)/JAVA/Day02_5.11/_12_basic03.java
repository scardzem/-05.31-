package Day02;

import java.util.Scanner;

public class _12_basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. int 배열로 10개의 공간을 생성하라
  		 	 1 ~ 10까지의 임의의 수를 저장하고
  			 홀수만 골라서 출력하라*/
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요.");
			nums[i] = sc.nextInt();
		}
		
		for(int num : nums) {
			if(num % 2 == 1) {
				System.out.println(num);
			}
		}
	}

}
