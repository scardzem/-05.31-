package Day01;

public class _11_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. while �ݺ���
		int sum = 0;
		int i = 0;
		
		//���ǽ��� true�� �� �ݺ��ؼ� ����
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1 ~ 100������ ���� " + sum);
	}

}
