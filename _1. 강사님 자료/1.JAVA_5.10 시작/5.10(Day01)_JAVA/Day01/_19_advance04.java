package Day01;

import java.util.Scanner;

public class _19_advance04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. 369������ �ۼ��մϴ�.
   		  	 1~99������ ������ �Է¹ް�
   		  	 3,6,9�� �ϳ��� ������ "�ڼ�¦"�� ����ϰ�
   			 2���� ������ "�ڼ�¦¦"�� ����ϼ���
   			 ���� ��� 13�� "�ڼ�¦"
   			 36�� ���� "�ڼ�¦¦"�� ����ϸ� �˴ϴ�.*/
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		// num = 81
		
		if(num >= 1 && num <= 99) {
			// tenNum = 8;
			int tenNum = num / 10;
			// oneNum = 81 - 8 * 10;
			// oneNum = 1;
			int oneNum = num - tenNum * 10;
			int count = 0;
			String printStr = "";
			
			if(tenNum > 0 && tenNum % 3 == 0) {
				count++;
			}
			
			if(oneNum > 0 && oneNum % 3 == 0) {
				count++;
			}
			
			if(count == 1) {
				System.out.println("�ڼ�¦");
			} else if(count == 2) {
				System.out.println("�ڼ�¦¦");
			} else {
				System.out.println("��� �ڸ������� 3�� ����� �����ϴ�.");
			}
			
			printStr = count == 1 ? "�ڼ�¦" : count == 2 ? "�ڼ�¦¦" : "��� �ڸ������� 3�� ����� �����ϴ�.";
			System.out.println(printStr);
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}

}
