package Day02;

public class _19_middle05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5. �������� �̷��� ����ϼ���
 			 2x1=2 3x1=3...9x1=9
 			 2x2=4
 			 ...
 			 2x9=18........9x9=81*/
		for(int i = 1;i <= 9; i++) {		
			for(int j = 2; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
				System.out.println("\n");
		}
	}

}
