package Day04;

public class _09_reasonOfTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus();
		Taxi tax = new Taxi();
		Vihicle vi = new Vihicle();
		
		Driver driver = new Driver();
		
		//�Ű������� �ڽİ�ü ����
		//���޵� �ڽİ�ü�� �θ�ü ���·� ����ȯ
		//�������̵��� �ڽİ�ü�� �޼ҵ尡 ȣ��
		driver.drive(bus);
		driver.drive(tax);
//		driver.drive(vi);
	}

}
