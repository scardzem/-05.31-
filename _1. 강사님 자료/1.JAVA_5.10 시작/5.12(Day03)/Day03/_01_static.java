package Day03;

public class _01_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���(�Ӽ�) ���
		//��ü �������� ��� ����
		//Car car = new Car(); ��ü���� ���� Ŭ������ ���(�Ӽ��� �޼ҵ�)�� ����
		String carColor = Car.color;
		System.out.println(carColor);
		System.out.println("------------------------------");
		
		//���� �޼ҵ� ���
		Car.colorInfo();
		System.out.println("------------------------------");
		
		//�ν��Ͻ� ��� ���
		/*
		 * Car car = new Car();
		 * 
		 * String carCompany = car.company; System.out.println(carCompany);
		 * System.out.println("------------------------------");
		 * 
		 * car.companyInfo();
		 * 
		 * System.out.println("------------------------------");
		 */
	}

}
