package Day05;

public class _05_arrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//index�� 0~2������ �迭����
		//index�� 3�� ��ҿ� ���� ��
		//ArrayIndexOutOfBoundException �߻�
		int[] intArr = new int[3];
		
		System.out.println(intArr[3]);
	}

}
