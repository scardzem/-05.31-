package Day03;

public class _07_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SamsungTv�� TvŬ������ ��ӹ޾Ƽ� TvŬ������ �ʵ�� �޼ҵ带 �����ϴ� ���·� ������
		SamsungTv samsungTv = new SamsungTv("�Ｚ", 300000, 47, "�򽺺�");
		LgTv lgTv = new LgTv("LG", 250000, 52, "���� ��ý��Ͻ�");
		
		//��ӹ��� �θ� �ʵ忡 ����
		System.out.println("�� Ƽ���� ������� : " + samsungTv.company);
		System.out.println("�� Ƽ���� ������ : " + samsungTv.price);
		System.out.println("�� Ƽ���� ������� : " + samsungTv.size);
		
		//�ڽ�Ŭ������ ���� �ʵ� ���
		System.out.println("�� Ƽ���� �ΰ������� : " + samsungTv.ai);
		
		//��ӹ��� �θ� Ŭ������ �޼ҵ� ����
		samsungTv.powerOn();
		samsungTv.powerOff();
		
		//�ڽ�Ŭ������ ���� �޼ҵ� ���
		samsungTv.turnOnAi();
	}

}
