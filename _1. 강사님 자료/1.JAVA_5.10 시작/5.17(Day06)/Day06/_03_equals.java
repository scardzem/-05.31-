package Day06;

public class _03_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "bit";
		String str2 = "bit";
		
		if(str1.equals(str2)) {
			System.out.println("���� ���ڿ��Դϴ�.");
		} else {
			System.out.println("�ٸ� ���ڿ��Դϴ�.");
		}
		System.out.println("---------------------------------");
		
		//���ڿ� �� �� == ����ϰ� �� ���
		//���� ��ü�� �����ϴ� �� ���ϰ� ��
		if(str1 == str2) {
			System.out.println("���� ���ڿ� ��ü ����");
		} else {
			System.out.println("�ٸ� ���ڿ� ��ü ����");
		}
		System.out.println("---------------------------------");
		
		String str3 = new String("bit");
		
		if(str1 == str3) {
			System.out.println("���� ���ڿ� ��ü ����");
		} else {
			System.out.println("�ٸ� ���ڿ� ��ü ����");
		}
	}

}
