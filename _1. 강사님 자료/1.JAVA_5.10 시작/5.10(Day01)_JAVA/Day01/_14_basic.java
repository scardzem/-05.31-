package Day01;

public class _14_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 10 ~ 1���� �Ųٷ� while������ ���*/
		int num1 = 10;
		while(num1 >= 1) {
			System.out.println(num1--);
		}		
		System.out.println("----------------------------------------");
		
		/*2. 10 ~ 1���� �Ųٷ� do ~ while������ ���*/
		int num2 = 10;
		do {
			System.out.println(num2--);
		} while(num2 >= 1);
		System.out.println("----------------------------------------");
		
		/*3. 10 ~ 1���� �Ųٷ� for������ ���*/
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("----------------------------------------");
		
		/*4. 1 ~ 100���� ���� while������ ���*/
		int sum1 = 0;
		int num3 = 0;
		
		while(num3 <= 100) {
			sum1 += num3;
			num3++;
		}
		
		System.out.println(sum1);
		System.out.println("----------------------------------------");
		
		/*5. 1 ~ 100���� ���� do ~ while������ ���*/
		int sum2 = 0;
		int num4 = 0;
		
		do {
			sum2 += num4;
			num4++;
		} while(num4 <= 100);
		System.out.println(sum2);
		System.out.println("----------------------------------------");
		
		/*6. 1 ~ 100���� ���� for������ ���*/
		int sum3 = 0;
		
		for(int j = 0; j <= 100; j++) {
			sum3 += j;
		}
		System.out.println(sum3);
	}
}
