package Day04.protect;

import Day04.Tv;

public class errorOfProtected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv();
		
		//protected 선언된 필드나 메소드는 다른 패키지의
		//클래스에서는 사용 불가능
		//tv.company = "LG";
		//tv.showCompany();
	}

}
