package Day04;

public class _09_reasonOfTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus();
		Taxi tax = new Taxi();
		Vihicle vi = new Vihicle();
		
		Driver driver = new Driver();
		
		//매개변수로 자식객체 전달
		//전달된 자식객체가 부모객체 형태로 형변환
		//오버라이딩된 자식객체의 메소드가 호출
		driver.drive(bus);
		driver.drive(tax);
//		driver.drive(vi);
	}

}
