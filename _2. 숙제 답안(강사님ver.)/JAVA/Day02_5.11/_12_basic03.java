package Day02;

import java.util.Scanner;

public class _12_basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. int �迭�� 10���� ������ �����϶�
  		 	 1 ~ 10������ ������ ���� �����ϰ�
  			 Ȧ���� ��� ����϶�*/
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("������ �Է��ϼ���.");
			nums[i] = sc.nextInt();
		}
		
		for(int num : nums) {
			if(num % 2 == 1) {
				System.out.println(num);
			}
		}
	}

}
