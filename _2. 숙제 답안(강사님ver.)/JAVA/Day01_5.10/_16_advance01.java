package Day01;

import java.io.IOException;

public class _16_advance01 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*1. �����ڸ� �Է¹޽��ϴ�
   			 �ҹ������� �빮������ �Ǻ��ϼ��� (���� �����ڸ� ����ϼ���)*/
		//�Էµ� Ű�� �ڵ尪 ���� (�������ǿ����ڷ� �ذ�)
		int num = System.in.read();
		
		String str = num >= 65 && num <= 90 ? "�빮��" : num >= 97 && num <= 122 ? "�ҹ���" : "�ٽ� �Է��ϼ���.";
		
		System.out.println(str);
	}

}
