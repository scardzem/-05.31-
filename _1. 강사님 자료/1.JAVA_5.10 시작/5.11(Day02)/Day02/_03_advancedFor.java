package Day02;

public class _03_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {100, 90, 80};
		int sum = 0;
		
		//scores �迭�� ��� ������ŭ �ݺ�
		//socres �迭�� ��� �ϳ��� ������ score ������ ��Ƽ� ���
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("������ ������ : " + sum );
	}

}
