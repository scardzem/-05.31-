package Day03;

public class _07_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SamsungTv가 Tv클래스를 상속받아서 Tv클래스의 필드와 메소드를 포함하는 형태로 생성됨
		SamsungTv samsungTv = new SamsungTv("삼성", 300000, 47, "빅스비");
		LgTv lgTv = new LgTv("LG", 250000, 52, "구글 어시스턴스");
		
		//상속받은 부모 필드에 접근
		System.out.println("이 티비의 제조사는 : " + samsungTv.company);
		System.out.println("이 티비의 가격은 : " + samsungTv.price);
		System.out.println("이 티비의 사이즈는 : " + samsungTv.size);
		
		//자식클래스의 고유 필드 사용
		System.out.println("이 티비의 인공지능은 : " + samsungTv.ai);
		
		//상속받은 부모 클래스의 메소드 접근
		samsungTv.powerOn();
		samsungTv.powerOff();
		
		//자식클래스의 고유 메소드 사용
		samsungTv.turnOnAi();
	}

}
