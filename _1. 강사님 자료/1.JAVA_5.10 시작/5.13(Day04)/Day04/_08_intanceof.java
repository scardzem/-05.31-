package Day04;

public class _08_intanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp1 = new SmartPhone();
		
		//�θ�ü�� �ڽİ�ü�� ������ ���� 
		//�θ�ü�� ���¿� �ڽİ�ü�� ���°� ������ ���·� ������
		Phone p1 = sp1;
		
		//�θ�ü�� ���·θ� ������
		Phone p2 = new Phone();
		
		//p1�� �ڽİ�ü�� ���°� ������ �����̱� ������
		//�ڽİ�ü���� ����ȯ ����
		if(p1 instanceof SmartPhone) {
			System.out.println("����Ʈ���� �����Դϴ�.");
		} else {
			System.out.println("����Ʈ���� ���°� �ƴմϴ�.");
		}
		System.out.println("-------------------------------");
		
		//p2�� �θ�ü�� ���¸� ������ �ֱ� ������ �ڽİ�ü���� ����ȯ �Ұ���
		if(p2 instanceof SmartPhone) {
			System.out.println("����Ʈ���� �����Դϴ�.");
		} else {
			System.out.println("����Ʈ���� ���°� �ƴմϴ�.");
		}
		System.out.println("-------------------------------");
		
		SmartPhone sp2 = (SmartPhone)p1;
		
		if(sp2 instanceof SmartPhone) {
			System.out.println("����Ʈ���� �����Դϴ�.");
		} else {
			System.out.println("����Ʈ���� ���°� �ƴմϴ�.");
		}
	}

}
