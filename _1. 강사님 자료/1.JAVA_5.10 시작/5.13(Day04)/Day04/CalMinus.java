package Day04;

public class CalMinus extends Calculator {
	int chk;
	//�θ��� Ŭ������ �����ϴ� �޼ҵ带 ������
	//�θ��� Ŭ������ �����ϴ� �޼ҵ�� ���°� ���� ����
	@Override
	//������̼� : � Ŭ������ �޼ҵ�, �Ǵ� �ʵ尡
	//    	    � ������ �ϴ��� ���� �����Ϸ����� �˷���
	//          ������ �ӵ� ���
	public int calculate(int a, int b) {
		if(chk == 1) {
			return super.calculate(a, b);
		} else {
			return a - b;
		}
	}
	
	@Override
	public int calculate(int a, int b, int c) {
		if(chk == 1) {
			return super.calculate(a, b, c);
		} else {
			return a - b - c;
		}
	}
}
