package Day06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _15_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.util ��Ű���� java.lang��Ű���� �ٸ���
		//�⺻�������� �����Ƿ� import �ʿ�
		Date now = new Date();
		
		//������� ���� �� ���� ��, ��, ��, ��, ��, �ʿ� �´� �������� �����ؾ� �ȴ�.
		//�� -> yyyy
		//�� -> MM
		//�� -> dd
		//�� -> hh
		//�� -> mm
		//�� -> ss
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		System.out.println("���� ��¥�� �ð��� : " + sdf.format(now));
		//Date��ü�� .toString()���� ���ڿ� ġȯ �� ��¥�� �ð��� �������� ǥ��
		System.out.println(now.toString());
	}

}
