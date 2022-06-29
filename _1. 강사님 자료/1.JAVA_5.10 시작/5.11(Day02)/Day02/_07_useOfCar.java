package Day02;

public class _07_useOfCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("제네시스", "검정", 50000000);
		Car car2 = new Car("아반떼", "빨강", 30000000);
		
		car1.carInfo();
		System.out.println("------------------------------");
		car2.carInfo();
	}

}
