package Day03;

public class _02_useOfSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이미 Singleton 클래스에 하나의 객체가 생성되어 있기 때문에 컴파일 오류
		//Singleton s1 = new Singleton();
		
		//Singleton 클래스에 생성되어 있는 객체를 반환받아 사용
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		//각각 다른 객체들이 생성되어 저장
		Car car1 = new Car();
		Car car2 = new Car();
		
		if(s1 == s2) {
			System.out.println("같은 singleton 객체");
		} else {
			System.out.println("다른 singleton 객체");
		}
		
		System.out.println("----------------------------------");
		if(car1 == car2) {
			System.out.println("같은 car 객체");
		} else {
			System.out.println("다른 car 객체");
		}
	}

}
