package Day02;

public class _15_middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 1000������ �ڿ��� �߿��� 2�� ����̸鼭 7�� ����� ���ڸ� ����ϰ�,
   			 �� ��µ� ���ڵ��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���*/
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println("1000������ �ڿ��� �� 2�� ����̸鼭 7�� ����� ������ : " + sum);
	}

}
