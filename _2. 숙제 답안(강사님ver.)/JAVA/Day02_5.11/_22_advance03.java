package Day02;

public class _22_advance03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3.AB + BA = 99 �� �����ϴ� ��� A�� B�� ������ ���ϴ� ���α׷��� �ۼ��ϼ���.*/
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				int numAB = a * 10 + b;
				int numBA = b * 10 + a;
				if (numAB + numBA == 99) {
					System.out.println("A��  " + a + ", B�� : " + b + "�� ��");
				}
			}
		}
	}

}
