package Day01;

import java.util.Scanner;

public class _18_advance03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. ���� �׼��� �Ա��ϼ���
   			 �Ա��� ���� ��������, ������, ��õ����, õ����, 500������, 100������, 50������, 10������, 1������ �� ��� ��ȯ�Ǵ��� ����ϼ���
   			 ��� ������ ������ ū �� ������ ����մϴ�
   			 ���� ��� 78670���̸� <������ 1��, ���� 2��, ��õ�� 1��, õ�� 3��, 500�� 1��, 100�� 1��, 50�� 1��, 10�� 2��> �Դϴ�.*/
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int count;
		String printStr = "";
		
		count = money / 50000;
		printStr += "<������ " + count + "��, ";
		money -= count * 50000;
		
		
		count = money / 10000;
		printStr += "���� " + count + "��, ";
		money -= count * 10000;
		
		count = money / 5000;
		printStr += "��õ�� " + count + "��, ";
		money -= count * 5000;
		
		count = money / 1000;
		printStr += "õ�� " + count + "��, ";
		money -= count * 1000;
		
		count = money / 500;
		printStr += "500�� " + count + "��, ";
		money -= count * 500;
		
		count = money / 100;
		printStr += "100�� " + count + "��, ";
		money -= count * 100;
		
		count = money / 50;
		printStr += "50�� " + count + "��, ";
		money -= count * 50;
		
		count = money / 10;
		printStr += "10�� " + count + "��> �Դϴ�.";
		money -= count * 10;
		
		System.out.println(printStr);
	}

}
