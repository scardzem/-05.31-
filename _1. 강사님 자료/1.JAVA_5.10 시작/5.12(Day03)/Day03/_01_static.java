package Day03;

public class _01_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정적 멤버(속성) 사용
		//객체 생성없이 사용 가능
		//Car car = new Car(); 객체생성 없이 클래스의 멤버(속성과 메소드)에 접근
		String carColor = Car.color;
		System.out.println(carColor);
		System.out.println("------------------------------");
		
		//정적 메소드 사용
		Car.colorInfo();
		System.out.println("------------------------------");
		
		//인스턴스 멤버 사용
		/*
		 * Car car = new Car();
		 * 
		 * String carCompany = car.company; System.out.println(carCompany);
		 * System.out.println("------------------------------");
		 * 
		 * car.companyInfo();
		 * 
		 * System.out.println("------------------------------");
		 */
	}

}
