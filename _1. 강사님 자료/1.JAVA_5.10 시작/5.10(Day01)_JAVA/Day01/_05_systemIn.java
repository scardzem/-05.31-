package Day01;

import java.io.IOException;

public class _05_systemIn {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//2. �ý��� �Է�
		int keyCode;
		
		//�ݺ��� ��ȣ���� ������ ���̸� ��� �ݺ�
		while(true) {
			keyCode = System.in.read();
			System.out.println(keyCode);
			
			//�Էµ� Ű�ڵ� ���� �ҹ��� q�� �� �ݺ��� ����
			if(keyCode == 113) {
				break;
			}
		}
	}

}
