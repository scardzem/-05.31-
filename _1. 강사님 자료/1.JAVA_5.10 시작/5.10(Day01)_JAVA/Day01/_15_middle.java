package Day01;

public class _15_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. while���� �̿��ؼ� 1���� 100���� ����ϼ���*/
		int num1 = 1;
		
		while(num1 <= 100) {
			System.out.println(num1++);
		}
		System.out.println("-------------------------------");
		
		/*2. while���� �̿��ؼ� 10���� 20���� ����ϼ���*/
		int num2 = 10;
		
		while(num2 <= 20) {
			System.out.println(num2++);
		}
		System.out.println("-------------------------------");
		
		int num3 = 1;
		
		while(num3 <= 100) {
			if(num3 >= 10 && num3 <= 20) {
				System.out.println(num3);
			}
			num3++;
		}
		System.out.println("-------------------------------");
		
		/*3. while���� �̿��ؼ� 1���� 10���� ���� ����ϼ���*/
		int num4 = 1;
		int sum1 = 0;
		
		while(num4 <= 10) {
			sum1 += num4++;
		}
		System.out.println(sum1);
		System.out.println("-------------------------------");
		
		/*4. while���� �̿��ؼ� 1���� 10���� �߿� ¦���� ����ϼ���*/
		int num5 = 1;
		
		while(num5 <= 10) {
			if(num5 % 2 == 0) {
				System.out.println(num5);
			}
			num5++;
		}
		System.out.println("-------------------------------");
		
		/*5. ��ø for���� �̿��Ͽ� ������ ���� ǥ���Ͻÿ�.*/
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
