package Day03;

public class _06_getterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userInfo userinfo = new userInfo();
		
		//private�� ����� �ʵ忡 ���� ���� �Ұ�
		//userinfo.userName = "ȫ�浿";
		
		//private�� ����� �ʵ��� ���� �ٲܶ��� setter�޼ҵ带 ���
		userinfo.setUserName("ȫ�浿");
		userinfo.setPhoneNum("010-0000-0000");
		userinfo.setUserAge(20);
		
		//private�� ����� �ʵ� ���� ����� getter �޼ҵ� ���
		//System.out.println("������� �̸��� : " + userinfo.userName);
		System.out.println("������� �̸��� : " + userinfo.getUserName());
		System.out.println("������� ����ó�� : " + userinfo.getPhoneNum());
		System.out.println("������� ���̴� : " + userinfo.getUserAge());
	}

}
