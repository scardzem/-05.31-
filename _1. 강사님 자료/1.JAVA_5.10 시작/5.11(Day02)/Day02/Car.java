package Day02;

public class Car {
	String company;
	String color;
	int price;
	String model;
	
	public Car() {
		company = "����";
//		color = "����";
//		price = 30000000;
		
		System.out.println("�⺻������ ȣ��");
	}
	
	public Car(String mod, String col, int pri) {
		//this() �޼ҵ带 ���� �ٸ� ������ ȣ��
		//�������� �����ϰ� ����, ��, ���� �ٸ� ��
		//�ߺ��Ǵ� �ڵ带 �����Ͽ� �ҽ��ڵ� ����ȭ�ϱ� ����
		this();
		model = mod;
		price = pri;
		color = col;
		
		System.out.println("�� ��° ������ ȣ��");
	}
	
	//�޼ҵ带 ���� �� ���� ��ȯ ���� � Ÿ���� ������� ��
	//int add(int a, int b) {
	//	int c = a + b;
	//	return c;
	//}
	//void : ��ȯ ���� ���� �޼ҵ�
	public void carInfo() {
		//this ��ü�� ���� ���� Ŭ������ �Ӽ� �� ����
		System.out.println(this.company);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.model);
	}
}
