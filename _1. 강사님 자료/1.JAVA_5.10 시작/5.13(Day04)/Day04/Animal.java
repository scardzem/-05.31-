package Day04;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("���� ���ϴ�.");
	}
	
	//�߻�޼ҵ� ����
	//�ڽİ�ü������ ������ �ٸ� ��
	//�ڽİ�ü���� ���� ����
	public abstract void sound();
}
