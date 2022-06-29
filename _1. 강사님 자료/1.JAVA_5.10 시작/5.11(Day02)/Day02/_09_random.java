package Day02;

public class _09_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 0~100까지 사이의 난수 발생
		// 0.0 * 101 <= num1 < 1.0 * 101
		// 0 <= num1 < 101
		int num1 = (int)(Math.random() * 101);
		System.out.println("발생된 난수 : " + num1);
		System.out.println("------------------------------");
		
		//2. 기본 난수 발생
		// 0.0 <= num2 < 1.0의 실수
		double num2 = (double)Math.random();
		System.out.println("발생된 난수 : " + num2);
		System.out.println("------------------------------");
		
		//3. 1 ~ 45까지의 난수 발생
		// 0.0 * 45 + 1 <= num3 < 1.0 * 45 + 1
		// 1 <= num3 < 46
		int num3 = (int)(Math.random() * 45) + 1; 
		System.out.println("발생된 난수 : " + num3);
		System.out.println("------------------------------");
	}

}
