package Day01;

public class _03_changeType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 자동 타입변환
		byte byteVal = 10;
		//허용범위가 작은 byte타입에서 허용범위가 큰 int타입으로 자동으로 타입변환 이루어짐
		int intVal = byteVal;
		
		System.out.println(intVal);
		System.out.println("-------------------------------------");
		
		char ch1 = 'A';
		//허용범위가 작은 char타입에서 허용범위가 큰 int타입으로 자동으로 타입변환 이루어짐
		//A에 해당하는 ASCII코드 값 표출
		intVal = ch1;
		
		System.out.println(intVal);
		System.out.println("-------------------------------------");
		
		//2. 강제 타입변환
		int intVal2 = 10;
		//int 타입의 변수를 byte 타입으로 강제 타입변환
		byte byteVal2 = (byte)intVal2;
		
		System.out.println(byteVal2);
		System.out.println("-------------------------------------");
		
		int intVal3 = 65;
		//int 타입의 변수를 char 타입으로 강제 타입변환
		//ASCII 코드 값 65인 A 표출
		char ch2 = (char)intVal3;
		
		System.out.println(ch2);
		System.out.println("-------------------------------------");
		
		//3. 연산중 타입 변환
		int num1 = 10;
		long num2 = 20L;
		//연산되기 전에 num1의 타입이 long타입으로 자동 변환
		long result1 = num1 + num2;
		
		System.out.println(result1);
		System.out.println("-------------------------------------");
		
		float num3 = 3.14f;
		double num4 = 6.75;
		//연산되기 전에 num3의 타입이 double타입으로 자동 변환
		double result2 = num3 + num4;
		
		System.out.println(result2);
		System.out.println("-------------------------------------");
		
		//4. 문자열이 포함된 +연산에서의 타입변환
		int num5 = 111;
		String str1 = "hello";
		//num5가 자동으로 문자열로 변환되어 문자열 결합 연산이 이루어짐
		String result3 = str1 + num5;
		
		System.out.println(result3);
		System.out.println("-------------------------------------");
		
		//5. 문자열의 강제 타입변환
		String str2 = "100";
		//자바에서 제공하는 Integer 클래스의 int형 타입변환 메소드를 이용한 강제 타입변환
		int num6 = Integer.parseInt(str2);
		
		System.out.println(num6);
		//자바에서 제공하는 Double 클래스의 double형 타입변환 메소드를 이용한 강제 타입변환
		System.out.println("-------------------------------------");
		
		String str3 = "3.14";
		double num7 = Double.parseDouble(str3);
		
		System.out.println(num7);
		System.out.println("-------------------------------------");
	}

}
