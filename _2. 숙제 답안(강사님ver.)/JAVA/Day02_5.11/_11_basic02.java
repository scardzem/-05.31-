package Day02;

import java.util.Scanner;

public class _11_basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. int�迭�� 10�� �����ض�
  			 ����ڷκ��� 10���� ���� �Է¹ް�
  			 ������� ����ϰ� 
  			 ������ ���ϼ���*/
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("������ �Է��ϼ���.");
			nums[i] = sc.nextInt();
		}
		
		for(int num : nums) {
			sum += num;
			System.out.println(num);
		}
		
		System.out.println("�� ���� : " + sum);
	}

}
