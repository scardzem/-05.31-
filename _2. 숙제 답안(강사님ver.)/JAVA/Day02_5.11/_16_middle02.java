package Day02;

import java.util.Scanner;

public class _16_middle02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. 0���� ū ������ �Է¹ް� �������� 16������ ����ϼ���*/
		Scanner sc = new Scanner(System.in);
		int num;
		int[] twoNum = new int[100];
		
		while(true) {
			System.out.print("0���� ū ���� �Է��ϼ���.");
			num = sc.nextInt();
			if(num < 0) {
				continue;
			} else {
				break;
			}
		}
		
		System.out.printf("16���� : 0x%x \n",num);
		
		System.out.print("2���� : ");
		for (int i = 99; i >= 0; i--) {
			if (twoNum[i] == 1) {
				for (int j = i; j >= 0; j--) {
					System.out.print(twoNum[j]);
				}
				System.out.println(" ");
				break;
			}
		}
	}

}
