package Day02;

import java.util.Scanner;

public class _13_basic04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. ���� 10���� �Է¹޾� �迭�� �����ϰ�, 
			 �� �����߿��� 2�� ����� 3�� ����� ����ϼ���.*/
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("������ �Է��ϼ���.");
			nums[i] = sc.nextInt();
		}
		
		for(int num : nums) {
			if(num % 2 == 0 || num % 3 == 0) {
				System.out.println(num);
			}
		}
	}
	
}
