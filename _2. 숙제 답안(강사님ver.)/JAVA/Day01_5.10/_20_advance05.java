package Day01;

import java.util.Scanner;

public class _20_advance05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5. ���� 3���� �Է¹ް� �� 3���� ���� �ﰢ���� ���� �� �ִ����� �Ǻ��ϼ���
   			 �ﰢ���� �����Ϸ��� �� ���� ���� �ٸ� �� ���� �պ��� �ݵ�� Ŀ�� �մϴ�. (���� �����ڸ� ����ϼ���)*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x ���� �Է��ϼ���. : ");
		int x = sc.nextInt();
		
		System.out.print("y ���� �Է��ϼ���. : ");
		int y = sc.nextInt();
		
		System.out.print("z ���� �Է��ϼ���. : ");
		int z = sc.nextInt();
		
		String printStr = (x + y > z) && (x + z > y) && (y + z > x) ? "�ﰢ�� ����" : "�ﰢ�� �Ұ���"; 
		
		System.out.println(printStr);
	}

}
