package Day04;

public class SamsungTv extends Tv{
	SamsungTv() {
		//부모 클래스의 protected로 선언된 필드랑 메소드는
		//자식 클래스에서 사용가능
		this.company = "삼성";
		this.showCompany();
	}
}
