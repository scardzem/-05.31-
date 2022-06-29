package Day01;

public class _15_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. while문을 이용해서 1부터 100까지 출력하세요*/
		int num1 = 1;
		
		while(num1 <= 100) {
			System.out.println(num1++);
		}
		System.out.println("-------------------------------");
		
		/*2. while문을 이용해서 10부터 20까지 출력하세요*/
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
		
		/*3. while문을 이용해서 1부터 10까지 합을 출력하세요*/
		int num4 = 1;
		int sum1 = 0;
		
		while(num4 <= 10) {
			sum1 += num4++;
		}
		System.out.println(sum1);
		System.out.println("-------------------------------");
		
		/*4. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요*/
		int num5 = 1;
		
		while(num5 <= 10) {
			if(num5 % 2 == 0) {
				System.out.println(num5);
			}
			num5++;
		}
		System.out.println("-------------------------------");
		
		/*5. 중첩 for문을 이용하여 다음과 같이 표출하시오.*/
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
