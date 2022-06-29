package Day02;

public class Car {
	String company;
	String color;
	int price;
	String model;
	
	public Car() {
		company = "현대";
//		color = "레드";
//		price = 30000000;
		
		System.out.println("기본생성자 호출");
	}
	
	public Car(String mod, String col, int pri) {
		//this() 메소드를 통한 다른 생성자 호출
		//현대차만 생산하고 가격, 모델, 색상만 다를 때
		//중복되는 코드를 제거하여 소스코드 간략화하기 위함
		this();
		model = mod;
		price = pri;
		color = col;
		
		System.out.println("두 번째 생성자 호출");
	}
	
	//메소드를 정의 할 때는 반환 값이 어떤 타입이 정해줘야 됨
	//int add(int a, int b) {
	//	int c = a + b;
	//	return c;
	//}
	//void : 반환 값이 없는 메소드
	public void carInfo() {
		//this 객체를 통한 현재 클래스의 속성 값 접근
		System.out.println(this.company);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.model);
	}
}
