package Day04;

public class _07_forceTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp1 = new SmartPhone();
		
		//1. �θ�ü ���� �� �θ�ü�� ����
		Phone p1 = new Phone();
		
		//2. �θ�ü ���� �� �ڽİ�ü ����
		Phone p2 = sp1;
		
		//3. �θ�ü�� �ڽİ�ü ���·� ���� ����ȯ
		//�θ�ü ���·� ������ �θ�ü�� �ڽİ�ü�� ����ȯ �Ұ���
		//���� �߻�
		//SmartPhone sp2 = (SmartPhone)p1;
		//�ڽİ�ü�� ���Ե� �θ�ü�� ������ �ڽİ�ü�� ����ȯ ����
		SmartPhone sp3 = (SmartPhone)p2;
		
		//sp2.showSize();
		sp3.showSize();
	}

}
