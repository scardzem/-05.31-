package Day02;

//1. Ŭ���� ����(��ü�� ���赵 ����)
public class Tv {
	//��ü�� �Ӽ� ����
	String company = "Samsung";
	int price;
	int size = 47;
	int weight = 2000;
	Speaker speaker = new Speaker();
	
	//�⺻ ������ �޼ҵ� �����Ǿ� �ִ� ���·� Ŭ������ �������	
	//������ �޼ҵ忡�� ��ü �Ӽ� ������ �ʱ�ȭ ����
	public Tv() {
		company = "LG"; 
		price = 30000000;
		System.out.println("Tv ��ü ����");
	}
	
	//����� ���� ������ �޼ҵ�
	//���޹��� ���� ������ �Ӽ� ���� �ʱ�ȭ�� �� �ִ�.
	public Tv(String com, int pri) {
		company = com;
		price = pri;
		System.out.println("����� ���� ������ ȣ��");
	}
	
	public Tv(String com, int pri, int si) {
		this(com, pri);
		System.out.println("����� ���� ������2 ȣ��");
	}
	
	//��ü�� ���۵� == �޼ҵ�
	void turnOn() {
		System.out.println("������ �Ҵ�.");
	}
	
	void turnOff() {
		System.out.println("������ ����.");
	}
	
	void changChannel() {
		System.out.println("ä���� �����Ѵ�.");
	}
	
//	void changeVolumn() {
//		System.out.println("������ �����Ѵ�.");
//	}
	
	void volumnUp() {
		speaker.volumnUp();
	}
	
	void volumnDown() {
		speaker.volumnDown();
	}
}
