package Day04;

public class Calculator {
	public int calculate(int a, int b) {
		return a + b;
	}
	
	//오버로딩 : 이미 존재하는 이름의 메소드를 매개변수의 개수나 타입에 변화를 줘
	//	 	  새롭게 만듬
	public int calculate(int a, int b, int c) {
		return a + b + c;
	}
}
