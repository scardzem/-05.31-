package Day01;

import java.io.IOException;

public class _17_advance02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*2. �����ڸ� �Է¹޽��ϴ�
   			 �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �����ؼ� ����ϼ��� 
   			(���� �����ڸ� ����ϼ���)
   			(�ƽ�Ű���̺�/�����ڵ����̺��� �����ϸ� �˴ϴ�)*/
		int num = System.in.read();
		
		char ch = num >= 65 && num <= 90 ? (char)(num + 32) : num >= 97 && num <= 122 ? (char)(num - 32) : '-';
		
		System.out.println(ch);
	}

}
